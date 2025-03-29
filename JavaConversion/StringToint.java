package JavaConversion;

public class StringToint {
    public static void main(String[] args) {
        String num = "123";
      int num1=  Integer.parseInt(num);
        System.out.println(((Object) num1).getClass().getSimpleName());
    }
}
