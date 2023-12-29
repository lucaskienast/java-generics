package basics;

import java.time.LocalDate;
import java.util.ArrayList;

public class Demo2 {

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        // names.add(LocalDate.now());
        names.add("Name 1");
        names.add("Name 2");

        String myFriendName = names.get(0);
        System.out.println(myFriendName);


        ArrayList<LocalDate> dates = new ArrayList<>();
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        // names.add("Name 2");

        LocalDate myDate = dates.get(0);
        System.out.println(myDate);
    }

}
