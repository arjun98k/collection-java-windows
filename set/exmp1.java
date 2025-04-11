package set;

import java.util.HashSet;

public class exmp1 {
    public static void main(String[] args) {
        HashSet<Integer> set1 = new HashSet<>();
        set1.add(11);
        set1.add(12);
        set1.add(11);
        System.out.println(set1);
        System.out.println(set1.hashCode());
    }
}
