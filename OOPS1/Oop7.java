package OOPS1;

class Hp {
    String name;
    int id;
    static String hosipitaltype = "ayurvedas";

    Hp(String n, int I){
        name = n;
        id = I;
    }
    void show(){
        System.out.println("name of hospital " + name + " id of hosiptal " + id + " " + hosipitaltype );
    }
}

public class Oop7 {
    public static void main(String[] args) {
   Hp obj = new Hp("moti",12);
   Hp obj2 = new Hp("arjun",1);
      obj.show();
      obj2.show();
    }

}
