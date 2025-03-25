package Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex1 {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("a*b");
                                          // * mean more a or zero or usse jyaada bhi ho chalega a and last mai b hona chahiye

        Matcher matcher = pattern.matcher("aaaabbb");

        boolean matches = matcher.matches();
        System.out.println(matches);
    }
}
