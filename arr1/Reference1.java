package arr1;

class Student{
    public  int id ;
}

public class Reference1 {
    public static void main(String[] args) {
    Student student = new Student();
    student.id = 1;
    fun(student);
        System.out.println(student.id);




    }

    private static  void fun(Student a){
        Student student = new Student();
        student.id = 2;
        a = student;
        System.out.println("change in fun method" +" " +  a.id);
        a.id = 2;
    }
}
