package stackCF;

import java.util.Stack;

public class Stack1 {
    public static void main(String[] args) {
        Stack<Integer> list = new Stack<>();
        list.push(1);
        list.push(2);
        list.push(3);
        list.push(4);
        list.push(5);

        for (int elements: list){
            System.out.println(elements);
        }

    }
}
