package GC;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class IdentityHashmap {
    public static void main(String[] args) {
    String key1 = new String("key");
    String key2 = new String("key");
        Map<String, Integer> map = new IdentityHashMap<>();
        map.put(key1,1);
        map.put(key2,2);
        System.out.println(map);
    }
}
