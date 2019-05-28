package queries.sql.v1;

import algos.CopyConstructor;

import java.util.Objects;

public class WhereJoinCondition extends WhereEqValueCondition {

    public String tableLeft;
    public String argLeft;

    public String tableRight;
    public String argRight;

    public WhereJoinCondition(String tableLeft, String argLeft, String tableRight, String argRight) {
        super(tableLeft, argRight, tableRight+"."+argRight);
        this.tableLeft = tableLeft;
        this.argLeft = argLeft;
        this.tableRight = tableRight;
        this.argRight = argRight;
    }

    @Override
    public String toString() {
        return tableLeft + "." + argLeft +" = " + tableRight+"."+argRight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhereJoinCondition that = (WhereJoinCondition) o;
        return Objects.equals(tableLeft, that.tableLeft) &&
                Objects.equals(argLeft, that.argLeft) &&
                Objects.equals(tableRight, that.tableRight) &&
                Objects.equals(argRight, that.argRight);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableLeft, argLeft, tableRight, argRight);
    }

    @Override
    public WhereJoinCondition copy() {
        return new WhereJoinCondition(tableLeft, argLeft, tableRight, argRight);
    }
}
