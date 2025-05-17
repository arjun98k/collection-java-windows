package OOPS1;
class Car{
    void Fourwheel(){
        System.out.println("car run on four wheel");
    }
}
class Tata extends Car {
    void Tatacar(){
        System.out.println("tata car run on 4 wheel");
    }
}
class TataXuv extends Tata{
    @Override
    void Tatacar(){
        System.out.println("this Xuv 700");
    }
}
public class Oop9 {
    public static void main(String[] args) {
        TataXuv carobj = new TataXuv();
        carobj.Tatacar();
        carobj.Fourwheel();
    }

}
