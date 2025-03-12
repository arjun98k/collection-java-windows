package enumeration;

public class Enum1
{
    public static void main(String[] args) {
//        System.out.println(Enumclass.FRIDAY);
        Enumclass  FRIDAY = Enumclass.FRIDAY;
        System.out.println(Enumclass.FRIDAY.ordinal());
        Enumclass TUESDAY = Enumclass.valueOf("TUESDAY");
        System.out.println(TUESDAY);
    }
}
