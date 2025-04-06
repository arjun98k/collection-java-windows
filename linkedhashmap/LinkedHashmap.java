package linkedhashmap;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashmap {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> linkedhashmap = new LinkedHashMap<>(11,0.3f,true);
        linkedhashmap.put(11,"Aditya sardesai");
        linkedhashmap.put(12,"amey coolkarni");
        linkedhashmap.put(13,"Arjun kandekar");
     linkedhashmap.get("Arjun kandekar");

        for (Map.Entry<Integer,String> entry : linkedhashmap.entrySet()){
            System.out.println(entry.getKey() + " "+ entry.getValue());
        }
    }
}
