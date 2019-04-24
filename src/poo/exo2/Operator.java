package poo.exo2;

public interface Operator<T> extends Comparable<T>{
    default boolean isLess(T t) {
        return compareTo(t) < 0;
    }
    default boolean isGreater(T t) {
        return !isLess(t);
    }
}
