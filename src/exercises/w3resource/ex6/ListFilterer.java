package exercises.w3resource.ex6;

import java.util.ArrayList;
import java.util.List;

public class ListFilterer {

    public static <T> List<T> filterListByPredicate(List<T> originalList, UnaryPredicate<T> predicate) {
        List<T> resultsList = new ArrayList<>();

        for (T element : originalList) {
            if (predicate.test(element)) {
                resultsList.add(element);
            }
        }

        return resultsList;
    }

}
