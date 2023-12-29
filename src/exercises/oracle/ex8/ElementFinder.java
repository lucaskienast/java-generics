package exercises.oracle.ex8;

import java.util.List;

public class ElementFinder {

    public static <T extends Object & Comparable<? super T>> T max(
            List<? extends T> list, int begin, int end) {

        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin) {
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        }

        return maxElem;
    }

    public static <T extends Comparable<? super T>> T findMaxElement(List<? extends T> list, int begin, int end) {
        T maxElem = list.get(begin);

        for (++begin; begin < end; ++begin) {
            if (maxElem.compareTo(list.get(begin)) < 0)
                maxElem = list.get(begin);
        }

        return maxElem;
    }


    public static void main(String[] args) {
        List<Integer> integers = List.of(10, 2, 4, -6, 11, 7, -100);
        System.out.println(max(integers, 0, integers.size()));
        System.out.println(findMaxElement(integers, 0, integers.size()));
    }

}
