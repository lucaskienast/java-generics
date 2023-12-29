package internals;

import java.util.ArrayList;
import java.util.List;

public class GenericsRuntimeCheck {

    public static void main(String[] args) {
        List<String> namesList = new ArrayList<>();
        addToNames(namesList, "Name 1");
        addToNames(namesList, "Name 2");
        System.out.println(namesList);

        incorrectAddToNames(namesList, 100);
        System.out.println(namesList);

        // String name3 = namesList.get(2);
        // System.out.println(name3);
        
        String[] namesArray = new String[5];
        addToArray(namesArray, "Name 1");
        incorrectAddToArray(namesArray,  10);
        String name4 = namesArray[0];

    }

    private static void addToArray(String[] namesArray, String s) {
        namesArray[0] = s;
    }

    private static void incorrectAddToArray(Object[] namesArray, Integer i) {
        namesArray[0] = i;
    }

    private static void addToNames(List<String> names, String s) {
        names.add(s);
    }

    private static void incorrectAddToNames(List list, Integer i) {
        list.add(i);
    }

}
