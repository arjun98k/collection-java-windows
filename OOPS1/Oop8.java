package OOPS1;

class Emp {
    int salary = 8000;

}
class SE extends Emp {
    int bonus = 2000;

}

public class Oop8 {
    public static void main(String[] args) {
    SE obj = new SE();
        System.out.println("the salary of employee " + obj.salary + " and he is software engineer got bonus of " + obj.bonus);
    }
}
