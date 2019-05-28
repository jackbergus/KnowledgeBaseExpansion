package utils;

import java.util.Objects;

public class CompPair<K, V> {
    public K key;
    public V val;

    public CompPair(K key, V val) {
        this.key = key;
        this.val = val;
    }

    public K getKey() {
        return key;
    }

    public V getVal() {
        return val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CompPair<?, ?> compPair = (CompPair<?, ?>) o;
        return Objects.equals(key, compPair.key) &&
                Objects.equals(val, compPair.val);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, val);
    }
}
