package OOPS1;


class   Parent{
    String name;
    Parent (String name){
        System.out.println("hello parent constructor "+ name);
    }
}
class Child extends Parent{

    Child (String name){
    super(name);
        System.out.println("child constructor");
    }
}
public class Oops5 {
    public static void main(String[] args) {
Child ak = new Child("Aditya");

    }
}
