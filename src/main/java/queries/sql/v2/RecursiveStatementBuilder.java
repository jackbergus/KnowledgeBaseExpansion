package queries.sql.v2;

import com.google.common.collect.HashMultimap;
import queries.sql.v1.WhereEqValueCondition;
import types.Proposition;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class RecursiveStatementBuilder {
    private final Properties properties;
    private String[] outerSelectFields;
    private HashMultimap<List<? extends WhereEqValueCondition>, Proposition> casus;
    private String nullValue;
    public int maximumNumberOfSelfJoins;

    public RecursiveStatementBuilder() throws IOException {
        properties = new Properties();
        properties.load(new FileReader("query_generation.properties"));
        outerSelectFields = properties.getProperty("expansionTable").split(",");
        casus = HashMultimap.create();
        nullValue = properties.getProperty("nullValue");
    }

    /**
     *
     * @param i Position of the element of the field
     * @return String representation for the SELECT clause
     */
    public String getIthField(int i) {
        return "D->>"+i+" as "+outerSelectFields[i];
    }

    /**
     * Maximum number
     * @return
     */
    public int getNumberOfSelfJoins() {
        return maximumNumberOfSelfJoins;
    }

    public String getIthTableJoin(int i) {
        return properties.getProperty("expansionTableName")+" t"+i;
    }

    public void addCasus(List<? extends WhereEqValueCondition> condition, Proposition toJsonBuildArray) {
        casus.put(condition, toJsonBuildArray);
    }

    public String toJsonBuildArray(Proposition y) {
        return "json_build_array('" + y.relName + "'" + y.args.stream().map(x -> x.value == null || x.value.equals(nullValue) ? nullValue : (x.isVariable ? x.value : ("'"+x.value+"'"))) + ")";
    }

    public String listAllTheCases(Collection<Proposition> casi) {
        return "ARRAY[" + casi.stream().map(this::toJsonBuildArray).collect(Collectors.joining(",")) +"]";
    }

    public String caseToString(Map.Entry<List<? extends WhereEqValueCondition>, Collection<Proposition>> caseWhenThen) {
        return "WHEN " + caseWhenThen.getKey() +" THEN "+ listAllTheCases(caseWhenThen.getValue());
    }

    @Override
    public String toString() {
        return "SELECT " + IntStream.range(0, outerSelectFields.length).mapToObj(this::getIthField).collect(Collectors.joining(",\n       ")) +
               "FROM\n" +
                "  (SELECT unnest(C) AS D\n" +
                "   FROM\n" +
                "     (SELECT CASE "+ casus.asMap().entrySet().stream().map(this::caseToString).collect(Collectors.joining("\n")) +
                "     ELSE ARRAY[]::json[]\n" +
                "             END AS C\n" +
                "      FROM "+ IntStream.range(0, getNumberOfSelfJoins()).mapToObj(this::getIthField).collect(Collectors.joining(", ")) +") T) AS V";
    }

    public static long fibonacci(long i) {
        return fibonacci(i-1)+fibonacci(i-2);
    }

    public static void main(String s[]) {

        Set<String> knowledgeBase = new HashSet<>();
        Set<String> groundedKnowledgeBase = new HashSet<>();
        knowledgeBase.add("hello");
        knowledgeBase.add("world");
        do {
            // Recursion.... f(knowledgeBase)
        } while (! groundedKnowledgeBase.containsAll(knowledgeBase));
        knowledgeBase = groundedKnowledgeBase;

        // f(kb), f(f(kb)), f(f(f(kb))) ..... f^n(kb)=f^{n+1}(kb)

    }

}
