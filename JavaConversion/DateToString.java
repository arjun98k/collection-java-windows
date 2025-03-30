package JavaConversion;


import java.text.SimpleDateFormat;
import java.util.Date;

public class DateToString {
    public static void main(String[] args) {
        Date currentdate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("d-M-yyyy HH:mm:ss");
        String format =    sdf.format(currentdate);
        System.out.println(format);
    }
}
