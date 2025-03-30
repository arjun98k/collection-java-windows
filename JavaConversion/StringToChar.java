package JavaConversion;

public class StringToChar {
    public static void main(String[] args) {
        String str = "Arjun";

        char c = str.charAt(0);
//        System.out.println(c);
        for (int i = 0; i <=str.length()-1 ; i++) {
            char b = str.charAt(i);
            System.out.println(b);
        }
    }
}
