package sortttedhashmap;

import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class examp1 {

    public static void main(String[] args) {
        SortedMap<String, Integer> sortermap = new TreeMap<>();
        sortermap.put("aditya",11);
        sortermap.put("arjun",98);
        sortermap.put("cutie",99);
        sortermap.put("kritika",101);
//        System.out.println(sortermap);

        System.out.println(sortermap.lastKey());


//        for (Map.Entry<String,Integer> entry: sortermap.entrySet()){
//            System.out.println(entry.getKey() + " " + entry.getValue());
//        }
    }
}
