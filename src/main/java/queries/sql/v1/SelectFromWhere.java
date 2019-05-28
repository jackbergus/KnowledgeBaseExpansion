package queries.sql.v1;

import algos.CopyConstructor;
import queries.bitmaps.BitMap;

import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;

public class SelectFromWhere implements CopyConstructor<SelectFromWhere> {

    private static Properties properties = null;
    private static List<String> arguments = null;

    // SELECT
    HashMap<String, String> selectArgumentToValue;

    // FROM
    List<String> tablesWithRenaming;

    // WHERE
    List<WhereJoinCondition> clauseJoins;
    List<WhereEqValueCondition> selectSpecificERTypes;
    HashMap<String, BitMap> notNullMaps;
    HashMap<String, BitMap> negatedMaps;
    QueryCollection generateIfNotExists;

    public SelectFromWhere(HashMap<String, String> selectionMap,
                           List<String> fromTables,
                           List<WhereJoinCondition> wjcLsAND,
                           List<WhereEqValueCondition> selectSpecificERTypes,
                           HashMap<String, BitMap> notNullMaps,
                           HashMap<String, BitMap> negatedMaps,
                           int nexExpectedSize) {

        if (properties == null || arguments == null) {
            try {
                properties = new Properties();
                properties.load(new FileReader("query_generation.properties"));
                String[] split = properties.getProperty("argumentsTable").split(",");
                arguments = Arrays.asList(split);
            } catch (IOException e) {
                e.printStackTrace();
                properties = null;
                arguments = null;
            }
        }

        this.selectArgumentToValue = selectionMap;
        this.tablesWithRenaming = fromTables;
        this.clauseJoins = wjcLsAND;
        this.selectSpecificERTypes = selectSpecificERTypes;
        this.notNullMaps = notNullMaps;
        this.negatedMaps = negatedMaps;
        this.generateIfNotExists = new QueryCollection(SetOperations.UNION, true, nexExpectedSize);
    }

    public SelectFromWhere(HashMap<String, String> selectionMap,
                           List<String> fromTables,
                           List<WhereJoinCondition> wjcLsAND,
                           List<WhereEqValueCondition> selectSpecificERTypes,
                           HashMap<String, BitMap> notNullMaps,
                           HashMap<String, BitMap> negatedMaps,
                           QueryCollection generateIfNotExists) {

        if (properties == null || arguments == null) {
            try {
                properties = new Properties();
                properties.load(new FileReader("query_generation.properties"));
                String[] split = properties.getProperty("argumentsTable").split(",");
                arguments = Arrays.asList(split);
            } catch (IOException e) {
                e.printStackTrace();
                properties = null;
                arguments = null;
            }
        }

        this.selectArgumentToValue = selectionMap;
        this.tablesWithRenaming = fromTables;
        this.clauseJoins = wjcLsAND;
        this.selectSpecificERTypes = selectSpecificERTypes;
        this.notNullMaps = notNullMaps;
        this.negatedMaps = negatedMaps;
        this.generateIfNotExists = generateIfNotExists;
    }

    public SelectFromWhere instantiateQuery(HashMap<String, String> map) {
        selectSpecificERTypes.forEach(x -> {
            String key = x.value.replace("'","");
            String exValue = map.get(key);
            x.value = "'"+exValue+"'";
        });
        String retType = properties.getProperty("type");
        String newType = selectArgumentToValue.get(retType).replace("'","");
        selectArgumentToValue.put(retType, "'"+map.get(newType)+"'");
        generateIfNotExists.distinctQueries.forEach(x -> x.instantiateQuery(map));
        return this;
    }

    public void addNotExistsResultSet(SelectFromWhere sfw) {
        this.generateIfNotExists.add(sfw);
    }

    @Override
    public String toString() {
        List<String> selectStatement = generateSelectArguments(selectArgumentToValue);

        // Defining the AND predicates
        List<String> whereJoinAndConditions = new ArrayList<>();
        selectSpecificERTypes.forEach(x -> whereJoinAndConditions.add(x.toString()));
        notNullMaps.forEach((x,y)-> whereJoinAndConditions.add("(~"+x+"."+properties.getProperty("null")+") &"+y.toString()));
        negatedMaps.forEach((x,y)-> whereJoinAndConditions.add("("+x+"."+properties.getProperty("negated")+") &"+y.toString()));
        clauseJoins.forEach(x -> whereJoinAndConditions.add(x.toString()));
        if (!generateIfNotExists.isEmpty()) {
            whereJoinAndConditions.add("NOT EXISTS("+generateIfNotExists.toString()+")");
        }

        return "SELECT " + (selectStatement.isEmpty() ? "*" : String.join(",\n       ", selectStatement)) +
                // Selecting the table concurring in the join
                "\n\tFROM "+(String.join(",", tablesWithRenaming))+
                // Join conditions
                (whereJoinAndConditions.isEmpty() ? "" : "\n\tWHERE ")+(String.join("\n\t  AND ", whereJoinAndConditions))
                +"\n\n";
    }

    public static String compileUnion(Collection<SelectFromWhere> sfw, boolean all) {
        return sfw.stream().map(SelectFromWhere::toString).collect(Collectors.joining("\n\t\t\tUNION "+(all ? "ALL" : "")+"\n"));
    }

    private List<String> generateSelectArguments(HashMap<String, String> map) {
        ArrayList<String> toReturn = new ArrayList<>();
        arguments.forEach(x -> toReturn.add(map.get(x)+" AS "+x));
        return toReturn;
    }

    @Override
    public SelectFromWhere copy() {
        HashMap<String, String> sa = new HashMap<>();
        sa.putAll(selectArgumentToValue);
        return new SelectFromWhere(sa,tablesWithRenaming, clauseJoins, CopyConstructor.listCopy(selectSpecificERTypes),notNullMaps, negatedMaps, generateIfNotExists.copy());
    }
}
