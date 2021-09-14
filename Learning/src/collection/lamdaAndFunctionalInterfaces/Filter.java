package collection.lamdaAndFunctionalInterfaces;

@FunctionalInterface
public interface Filter<T> {

    boolean test(T t);
}
