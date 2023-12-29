package wildcards;

import java.util.ArrayList;
import java.util.List;

public class WildcardsDemo1 {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Name 1");
        names.add("Name 2");
        printList(names);

        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        printList(numbers);

        List<?> tmp = names;
        tmp = numbers;
        Object obj = tmp.get(0);
        // tmp.add(1);
        // tmp.add("Hi");
        printList(tmp);
    }

    private static void printList(List<?> names) {
        names.forEach(System.out::println);
        // names.add("Foo");
        // names.add(new Object());
        Object obj = names.get(0);
    }

}
