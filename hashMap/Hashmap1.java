package hashMap;

import java.util.HashMap;
import java.util.Map;

public class Hashmap1 {
    public static void main(String[] args) {
        HashMap<Integer,String> l1 = new HashMap<>();
        l1.put(1, "aditi");
        l1.put(2,"amey");
        l1.put(3,"raju");
        l1.put(4,"Arjun");
//        System.out.println(l1);
        System.out.println( l1.containsValue("Arjun"));
        System.out.println(l1.get(3));
//        for (Map.Entry<Integer, String> entry : l1.entrySet()) {
//            System.out.println(entry.getKey() + ": " + entry.getValue());
//        }

    }
}
