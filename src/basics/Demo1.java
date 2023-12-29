package basics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Demo1 {

    public static void main(String[] args) {
        ArrayList names = new ArrayList();
        names.add(LocalDate.now());
        names.add("Name 1");
        names.add("Name 2");

        String myFriendName = (String) names.get(0);
        System.out.println(myFriendName);
    }

}
