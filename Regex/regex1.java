package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
                                          // * mean more a or zero a and last mai b hona chahiye
                                           // b ke baad be star ho toh utne bar b chahiye
        Matcher matcher = pattern.matcher("ba");

        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
