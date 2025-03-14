package linkedinlist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;



public class LinkuList {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(11);
        l1.add(2);
        l1.add(3);
        l1.add(3,120); // O(1)
//        l1.removeIf(x -> x%2 == 0);
        l1.addFirst(98);
        l1.addLast(99);
        System.out.println(l1.get(2)); // O(N)

//       for(int element : l1){
//           System.out.println(element);
//       }
        LinkedList<String> l2 = new LinkedList<>(Arrays.asList("Dog", "cat","elephant"));
        LinkedList<String> animalremove = new LinkedList<>(Arrays.asList("elephant"));
        System.out.println(l2.removeAll(animalremove));
        System.out.println(l2);
    }
}
