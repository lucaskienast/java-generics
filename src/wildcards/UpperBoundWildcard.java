package wildcards;

import java.util.ArrayList;
import java.util.List;

public class UpperBoundWildcard {

    public static void main(String[] args) {
        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        printList(integers);

        List<Double> doubles = new ArrayList<>();
        doubles.add(1.0);
        doubles.add(2.0);
        printList(doubles);

        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        // printList(names);

        List<Number> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2.0);
        printList(numbers);

        // addToList(integers, 10);
        // addToList(doubles, 10);
        addToList(numbers, 10);
    }

    private static void addToList(List<? super Number> numbers, int i) {
        numbers.add(i);
    }

    private static void printList(List<? extends Number> numbers) {
        numbers.forEach(System.out::println);
        Number number = numbers.get(0);
    }

}
