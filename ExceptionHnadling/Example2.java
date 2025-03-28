package ExceptionHnadling;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Example2 {
    public static void main(String[] args) throws FileNotFoundException {
        FileReader fileread = new FileReader("a.txt");
    }
}
