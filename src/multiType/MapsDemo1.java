package multiType;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapsDemo1 {

    public static void main(String[] args) {
        Map<String, LocalDate> m = new HashMap<>();
        m.put("Today", LocalDate.now());


    }

}
