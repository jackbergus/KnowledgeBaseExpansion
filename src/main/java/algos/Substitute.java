package algos;

import java.util.Objects;
import java.util.function.Consumer;

public class Substitute<K, T extends Substitutable<K>> implements Consumer<Substitute.SubPair<Substitutable<K>, K>> {

    private K toReplace;

    public Substitute(K toReplace) {
        this.toReplace = toReplace;
    }

    public static class SubPair<K, V> {
        public K first;
        public V second;

        public SubPair(K first, V second) {
            this.first = first;
            this.second = second;
        }
    }

    @Override
    public void accept(SubPair<Substitutable<K>, K> cp) {
        Substitutable<K> kSubstitutable = cp.first;
        if (cp.first == null)
            return;
        K newValue = cp.second;
        int inductiveN = kSubstitutable.inductiveCasesSize();
        if (inductiveN == 0) {
            for (int i = 0, M = kSubstitutable.boundedCasesSize(); i<M; i++) {
                K element = kSubstitutable.getBoundedCases(i);
                if (Objects.equals(toReplace, element))
                    kSubstitutable.updateBoundedCaseWith(i, newValue);
            }
        } else {
            int bindedM = kSubstitutable.boundedCasesSize();
            if (bindedM == 0) {
                for (int i = 0; i<inductiveN; i++) {
                    // cp.second is still always the same
                    accept(new SubPair<>(kSubstitutable.getInductiveCase(i), cp.second));
                }
            } else {
                for (int j = 0; j<bindedM; j++) {
                    if (Objects.equals(kSubstitutable.getBoundedCases(j), toReplace))
                        return;
                }
                if (!kSubstitutable.getFreeVariables().contains(toReplace)) {
                    for (int i = 0; i<inductiveN; i++) {
                        accept(new SubPair<>(kSubstitutable.getInductiveCase(i), cp.second));
                    }
                }
            }
        }
    }

    public void setSubstitute(K newCase) {
        this.toReplace = newCase;
    }
}
