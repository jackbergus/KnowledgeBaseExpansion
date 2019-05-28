package queries.sql.v1;

import algos.CopyConstructor;

import java.util.Objects;

public class WhereEqValueCondition implements CopyConstructor<WhereEqValueCondition> {

    public String tableLeft;
    public String argLeft;
    public String value;

    public WhereEqValueCondition(String tableLeft, String argLeft, String value) {
        this.tableLeft = tableLeft;
        this.argLeft = argLeft;
        this.value = value;
    }

    @Override
    public String toString() {
        return tableLeft + "." + argLeft +" = " + value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WhereEqValueCondition that = (WhereEqValueCondition) o;
        return Objects.equals(tableLeft, that.tableLeft) &&
                Objects.equals(argLeft, that.argLeft) &&
                Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tableLeft, argLeft, value);
    }

    @Override
    public WhereEqValueCondition copy() {
        return new WhereEqValueCondition(tableLeft, argLeft,value);
    }
}
