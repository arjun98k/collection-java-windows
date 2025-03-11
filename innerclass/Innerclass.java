package innerclass;

public class Innerclass {
    private  String inn2msg = "hello arjun from outside";

    class inner2class{
        void display(){
            System.out.println(inn2msg);
        }
    }

    void showmsg(){
        inner2class inner = new inner2class();
        inner.display();
    }

    public static void main(String[] args) {
     Innerclass outer = new Innerclass();
     outer.showmsg();
    }
}
