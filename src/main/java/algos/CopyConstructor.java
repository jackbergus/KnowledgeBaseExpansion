package algos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public interface CopyConstructor<T> extends Cloneable {
    <K extends CopyConstructor<T>> K copy();

    public static ArrayList emptyArrayList = new ArrayList<>();
    static <T, K extends CopyConstructor<T>> ArrayList<K> listCopy(List<K> original) {
        if (original != null) {
            ArrayList<K> toreturn = new ArrayList<>(original.size());
            for (int i = 0, originalSize = original.size(); i < originalSize; i++) {
                CopyConstructor<T> x = original.get(i);
                toreturn.add(x.copy());
            }
            return toreturn;
        } else {
            return (ArrayList<K>)emptyArrayList;
        }
    }
}
