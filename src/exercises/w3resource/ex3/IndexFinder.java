package exercises.w3resource.ex3;

import java.util.List;

public class IndexFinder {

    public static <T> int getIndexOfTargetElement(List<T> inputList, T targetElement) {
        for (int i = 0; i <inputList.size(); i++) {
            if (inputList.get(i).equals(targetElement)) return i;
        }
        return -1;
    }

}
