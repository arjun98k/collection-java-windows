package linkedinlist;

import java.util.LinkedList;



public class LinkuList {

    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(11);
        l1.add(2);
        l1.add(3);
        l1.add(3,120); // O(1)
       ` l1.removeIf(x -> x%2 == 0);

       for(int element : l1){
           System.out.println(element);
       }
    }
}
