package exercises.oracle.ex3;

public class Algorithm {

    /*

    Write a generic method to exchange the positions of two different elements in an array.

     */

    public static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
