package Regex;


import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class rejex2 {

    public static void findregex(String rex , String str){
        Pattern pattern = Pattern.compile(rex);
        Matcher matcher = pattern.matcher(str);
        boolean matches = matcher.matches();
        System.out.println(matches);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your regular expression");
        String rex = sc.nextLine();
        System.out.println("enter the string");
        String str = sc.nextLine();
        findregex(rex,str);
    }
}
