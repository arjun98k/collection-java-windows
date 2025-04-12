package QueueRepo;

import java.util.PriorityQueue;

public class PriorityyQueue1 {
    public static void main(String[] args) {
        PriorityQueue<Integer> l1 = new PriorityQueue<>();
        l1.add(12);
        l1.add(13);
        l1.add(14);
        l1.add(15);
        System.out.println(l1.poll());
        System.out.println(l1.isEmpty());
    }
}
