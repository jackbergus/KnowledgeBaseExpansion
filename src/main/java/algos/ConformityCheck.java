package algos;

/**
 * This interface defines all the classes that have an internal conformity check.
 * This is done to reduce as much as possible the complexity of the grammar, and for
 * checking at "compile time" whether the syntax represents the actual expected shape
 */
public interface ConformityCheck {
    boolean checkConformity();
}
