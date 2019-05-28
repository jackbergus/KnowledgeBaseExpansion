package algos;

import java.util.Set;

public interface Substitutable<T> {
    public int inductiveCasesSize();
    public int boundedCasesSize();
    public Substitutable<T> getInductiveCase(int i);
    public T getBoundedCases(int i);
    public void updateCaseWith(int i, T newCase);
    void updateBoundedCaseWith(int i, T newCase);
    public Set<T> getFreeVariables();
    public default void updateWith(T oldCase, T newCase) {
        Substitute<T, ? extends Substitutable<T>> l = new Substitute<>(oldCase);
        l.accept(new Substitute.SubPair<>(this, newCase));
    }
}
