package JavaConversion;

public class IntToString {
    public static void main(String[] args) {
        int string = 123;
        String con = Integer.toString(string);
        System.out.println(con.getClass().getSimpleName());
    }
}
