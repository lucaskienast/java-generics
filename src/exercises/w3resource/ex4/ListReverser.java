package exercises.w3resource.ex4;

import java.util.ArrayList;
import java.util.List;

public class ListReverser {

    public static <T> List<T> reverseListElements(List<T> originalList) {
        List<T> newList = new ArrayList<>();

        for (int i = originalList.size() - 1; i >= 0; i--) {
            newList.add(originalList.get(i));
        }

        return newList;
    }

}
