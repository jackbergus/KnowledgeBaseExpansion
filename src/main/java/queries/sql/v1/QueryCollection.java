package queries.sql.v1;

import algos.CopyConstructor;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class QueryCollection implements CopyConstructor<QueryCollection> {
    public ArrayList<SelectFromWhere> distinctQueries;
    public SetOperations op;
    public boolean isItAll;

    public QueryCollection(SetOperations op, boolean isItAll) {
       this(op, isItAll,0);
    }

    public QueryCollection(SetOperations op, boolean isItAll, int i) {
        this.op = op;
        distinctQueries = new ArrayList<>(i);
        this.isItAll = isItAll;
    }

    public QueryCollection(ArrayList<SelectFromWhere> distinctQueries, SetOperations op, boolean isItAll) {
        this.distinctQueries = distinctQueries;
        this.op = op;
        this.isItAll = isItAll;
    }

    public void add(SelectFromWhere sfw) {
        distinctQueries.add(sfw);
    }

    @Override
    public String toString() {
        return distinctQueries.stream().map(SelectFromWhere::toString).collect(Collectors.joining(op+" "+(isItAll ? "ALL " : "")+"\n\n\t"));
    }

    public boolean isEmpty() {
        return distinctQueries.isEmpty();
    }

    @Override
    public QueryCollection copy() {
        return new QueryCollection(CopyConstructor.listCopy(distinctQueries), op, isItAll);
    }
}
