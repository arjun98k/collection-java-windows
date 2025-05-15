package OOPS1;

// default constructor
class Oops{
    int id;
    String name;

    void show(){
        System.out.println(id + " "+ name);
    }
}

public class Oop4 {
    public static void main(String[] args) {
       Oops obj1 = new Oops();
        obj1.show();
    }
}
