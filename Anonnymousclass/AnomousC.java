package Anonnymousclass;

public class AnomousC {

     void outMeth() {

         class  Inner{
             void showmsg(){
                 System.out.println("inner class anmous");
             }
         }
         Inner obj = new Inner();
         obj.showmsg();
    }

    public static void main(String[] args) {
    AnomousC obj2 = new AnomousC();
    obj2.outMeth();
    }
}
