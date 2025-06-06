package OOPS1;


 abstract class Adi{
    void area(int a , int b){}
}

class Mani extends Adi {
    @Override
    void area(int a, int b) {

      int c=  a * b;
        System.out.println(c);
    }
}

public class Oop11 {
    public static void main(String[] args) {
     Mani obj = new Mani();
     obj.area(11,12);
     obj.area(12,14);
    }
}
