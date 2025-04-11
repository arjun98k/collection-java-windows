package set;

import java.util.LinkedHashSet;
import java.util.Set;

public class linkedhashset {
    public static void main(String[] args) {
        Set<Integer> set2 = new LinkedHashSet<>();
        set2.add(12);
        set2.add(13);
        set2.add(14);
        System.out.println(set2);
        System.out.println(set2.contains(13));
        System.out.println(set2.isEmpty());
        System.out.println(set2.size());
    }
}
