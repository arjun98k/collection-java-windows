package OOPS1;

class Address{
    String city , state;
    public Address(String city , String state){
        this.city = city;
        this.state = state;
    }
}
class Employee{
    String name;
    int id;
    Address address;
    public Employee(String name , int id, Address address){
        this.name = name;
        this.id = id;
        this.address = address;
    }
    void showInfo(){
        System.out.println("name of employee " + name + " and his id of emp " + id );
        System.out.println("name of city " + address.city + " State he live " + address.state);
    }
}

public class Oop10 {
    public static void main(String[] args) {
       Address address = new Address("navi mumbai","Maharashtra");
       Employee emp = new Employee("Arjun",98,address);
       emp.showInfo();
    }
}
