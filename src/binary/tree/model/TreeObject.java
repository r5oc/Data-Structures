package binary.tree.model;

public abstract class TreeObject<T> implements Comparable<T> {
    public abstract boolean equals(Object o);
    public abstract int hashCode();
    public abstract int compareTo(T other);
    public abstract String toString();
}
