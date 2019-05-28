package types;

import algos.CopyConstructor;
import algos.Substitutable;
import com.fasterxml.jackson.annotation.JsonIgnore;
import main.Main;
import ref.schemaParser;

import java.util.Collections;
import java.util.Objects;
import java.util.Set;

public class Predicate implements CopyConstructor<Predicate>, Substitutable<String> {
    public String varName;
    public boolean mustNotNull;

    public String lowerBoundVarName;
    public boolean lowerBoundInclusive;

    public String upperBoundVarName;
    public boolean upperBoundInclusive;

    @Override
    public String toString() {
        if (mustNotNull) {
            return varName+(Main.isLatex ? " \\neq\\texttt{NULL} " : " notnull");
        } else {
            StringBuilder sb = new StringBuilder();
            if (lowerBoundVarName != null) {
                sb.append(lowerBoundVarName);
                sb.append(lowerBoundInclusive ? (Main.isLatex ? " \\leq " : "<=") : "<");
            }
            sb.append(varName);
            if (upperBoundVarName != null) {
                sb.append(upperBoundInclusive ? (Main.isLatex ? " \\leq " : "<=") : "<");
                sb.append(upperBoundVarName);
            }
            return sb.toString();
        }
    }

    public Predicate(String varName) {
        this.varName = varName;
        this.mustNotNull = true;
        lowerBoundVarName = upperBoundVarName = null;
        lowerBoundInclusive = upperBoundInclusive = false;
    }

    public Predicate(String varName, String lowerBoundVarName, boolean lowerBoundInclusive, String upperBoundVarName, boolean upperBoundInclusive) {
        this.varName = varName;
        this.mustNotNull = false;
        this.lowerBoundVarName = lowerBoundVarName;
        this.lowerBoundInclusive = lowerBoundInclusive;
        this.upperBoundVarName = upperBoundVarName;
        this.upperBoundInclusive = upperBoundInclusive;
    }

    public static Predicate lt(String varName, String up) {
        return new Predicate(varName, null, false, up, false);
    }

    public static Predicate gt(String varName, String down) {
        return new Predicate(varName, down, false, null, false);
    }

    public static Predicate geq(String varName, String down) {
        return new Predicate(varName, down, true, null, false);
    }

    public static Predicate leq(String varName, String up) {
        return new Predicate(varName, null, false, up, true);
    }

    public static Predicate interval(String down, String varName, String up) {
        return new Predicate(varName, down, true, up, true);
    }


    public Predicate(Predicate x) {
        varName = new String(x.varName);
        mustNotNull = x.mustNotNull;
        lowerBoundVarName = x.lowerBoundVarName == null ? null : new String(x.lowerBoundVarName);
        lowerBoundInclusive = x.lowerBoundInclusive;
        upperBoundVarName = x.upperBoundVarName == null ? null : new String(x.upperBoundVarName);
        upperBoundInclusive = x.upperBoundInclusive;
    }

    public Predicate(schemaParser.PredicatesContext pred) {
        if (pred instanceof schemaParser.QuantificationContext) {
            schemaParser.QuantificationContext qc = (schemaParser.QuantificationContext)pred;
            mustNotNull = false;
            schemaParser.LboundContext lbound = qc.lbound();
            if (lbound != null) {
                lowerBoundVarName = lbound.STRING().getText();
                lowerBoundInclusive = qc.lbound().LEQ() != null;
            } else {
                lowerBoundVarName = null;
            }

            schemaParser.UboundContext ubound = qc.ubound();
            if (ubound != null) {
                upperBoundVarName = ubound.STRING().getText();
                upperBoundInclusive = qc.ubound().GEQ() != null;
            } else {
                upperBoundVarName = null;
            }
        } else {
            schemaParser.Var_notnullContext nn = (schemaParser.Var_notnullContext)pred;
            varName = nn.STRING().getText();
            mustNotNull = true;
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Predicate predicate = (Predicate) o;
        return mustNotNull == predicate.mustNotNull &&
                lowerBoundInclusive == predicate.lowerBoundInclusive &&
                upperBoundInclusive == predicate.upperBoundInclusive &&
                Objects.equals(varName, predicate.varName) &&
                Objects.equals(lowerBoundVarName, predicate.lowerBoundVarName) &&
                Objects.equals(upperBoundVarName, predicate.upperBoundVarName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(varName, mustNotNull, lowerBoundVarName, lowerBoundInclusive, upperBoundVarName, upperBoundInclusive);
    }

    @Override
    public Predicate copy() {
        return new Predicate(this);
    }

    @Override
    public int inductiveCasesSize() {
        return 0;
    }

    @Override
    public int boundedCasesSize() {
        return 1;
    }

    @Override
    public Substitutable<String> getInductiveCase(int i) {
        return null;
    }

    @Override
    public String getBoundedCases(int i) {
        return i == 0 ? varName : null;
    }

    @Override
    public void updateCaseWith(int i, String newCase) {
        //noop
    }

    @Override
    public void updateBoundedCaseWith(int i, String newCase) {
        if (i == 0) {
            varName = newCase;
        }
    }

    @Override @JsonIgnore
    public Set<String> getFreeVariables() {
        return Collections.singleton(varName);
    }
}
