package core.careerit.day19;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1, "Krish");
        map.put(2, "Raj");
        map.put(3, "Rahul");
        map.put(4, "Ravi");
        map.put(5, "Rajesh");
        System.out.println(map);

          // Get value by key
        System.out.println(map.get(3));

        Set <Integer> keys = map.keySet();
        for (Integer key : keys) {
            System.out.println("Key: " + key + " Value: " + map.get(key));
        }

        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        System.out.println(map.get(3));
        System.out.println(map.containsValue("Rahul"));
        System.out.println(map.get("Ramesh"));

    }
}
