package JavaConversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {
    public static void main(String[] args) throws ParseException {
        String str = "9-10-2002";
        Date date = new SimpleDateFormat("d-M-yyyy").parse(str);
        System.out.println(str+"\t"+date);
    }
}
