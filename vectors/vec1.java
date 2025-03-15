package vectors;

import java.util.Vector;

public class vec1 {
    public static void main(String[] args) {
        Vector l1 = new Vector<>();
        l1.add(1);
        l1.add(2);
        l1.add(3);
        l1.add(4);
        l1.add(5);
        System.out.println(l1);
        System.out.println(l1.capacity());
    }
}
