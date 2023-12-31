package exercises.w3resource.ex5;

import java.util.ArrayList;
import java.util.List;

public class ListMerger {

    public static <T> List<T> mergeLists(List<T> l1, List<T> l2) {
        List<T> mergedList = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < l1.size() && j < l2.size()) {
            mergedList.add(l1.get(i));
            mergedList.add(l2.get(j));
        }

        while (i < l1.size()) {
            mergedList.add(l1.get(i));
        }

        while (j < l2.size()) {
            mergedList.add(l2.get(j));
        }

        return mergedList;
    }

}
