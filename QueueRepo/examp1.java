package QueueRepo;

import java.util.LinkedList;
import java.util.Queue;

public class examp1 {
    public static void main(String[] args) {
        Queue<Integer> l1 = new LinkedList<>();
        l1.add(11);
        l1.add(12);
        l1.add(13);
        System.out.println(l1.peek());
        System.out.println(l1.poll());
//        System.out.println(l1.offer(12));
        l1.remove(12);
        System.out.println(l1.contains(12));
        System.out.println(l1.offer(12));
    }
}
