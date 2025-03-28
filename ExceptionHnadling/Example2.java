package ExceptionHnadling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {
//    public static void main(String[] args) throws FileNotFoundException {
//        FileReader fileread = new FileReader("a.txt");

    public static void main(String[] args) {
       try {
           int result = 10/0;
       } catch (Exception e) {
           System.out.println("catched error");
       }finally {
           System.out.println("finally block inside");
       }


    }
}
