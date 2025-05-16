package OOPS1;
class OOPSS {
    String name;
    int Id;

    OOPSS(String n ,int i){
     name =n;
     Id = i;
    }

    void display(){
        System.out.println(name + " "+ Id);
    }
}

public class Oop6 {
    public static void main(String[] args) {
        OOPSS obj = new OOPSS("arjun",98);
        obj.display();
    }
}
