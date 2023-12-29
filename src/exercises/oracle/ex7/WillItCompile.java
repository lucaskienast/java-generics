package exercises.oracle.ex7;

import java.util.List;

public class WillItCompile {

    public static void print(List<? extends Number> list) {
        for (Number n : list) {
            System.out.println(n + " ");
        }
        System.out.println();
    }

}
