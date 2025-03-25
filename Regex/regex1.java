package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("arjun");
        Matcher matcher = pattern.matcher("ar");

        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
