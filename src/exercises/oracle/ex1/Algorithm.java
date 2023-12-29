package exercises.oracle.ex1;

import java.util.Collection;

public class Algorithm {

    /*

    Write a generic method to count the number of elements in a collection
    that have a specific property (for example, odd integers, prime numbers, palindromes).

     */

    public static <T> int countElementsByProperty(Collection<T> c, UnaryPredicate<T> p) {
        int count = 0;

        for (T element : c) {
            if (p.test(element)) count++;
        }

        return count;
    }

}
