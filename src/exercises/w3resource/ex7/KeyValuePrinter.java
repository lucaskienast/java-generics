package exercises.w3resource.ex7;

import java.util.Map;

public class KeyValuePrinter {

    public static <K, V> void printKeyValuePairs(Map<K, V> map) {
        // map.entrySet().forEach(System.out::println);

        for (Map.Entry<K, V> entry : map.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();
            System.out.println(key + ": " + value);
        }

    }

}
