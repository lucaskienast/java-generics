package exercises.oracle.ex1;

import java.util.Arrays;
import java.util.Collection;

public class Main {

    public static void main(String[] args) {
        Collection<Integer> ci = Arrays.asList(1, 2, 3, 4);
        int count = Algorithm.countElementsByProperty(ci, new OddPredicate());
        System.out.println("Number of odd integers = " + count);
    }

}
