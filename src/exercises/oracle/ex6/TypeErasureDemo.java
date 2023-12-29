package exercises.oracle.ex6;

public class TypeErasureDemo {

    public static <T extends Comparable<T>> int findFirstGreaterThan(T[] at, T elem) {
        // some logic
        return -1;
    }


    // After type erasure

    public static int findFirstGreaterThan2(Comparable[] at, Comparable elem) {
        // some logic
        return -1;

    }

}
