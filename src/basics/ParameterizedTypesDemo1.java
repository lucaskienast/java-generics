package basics;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ParameterizedTypesDemo1 {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");

        String out = list.get(0);

        Iterator<String> iterator = list.iterator();
        iterator.next();
    }

}
