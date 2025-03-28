package ExceptionHnadling;

public class example1 {
    public static void main(String[] args) {
        int[] numerator = {2,4,40,10};
        int[] denominator = {2,2,0,5};
        for (int i = 0; i < numerator.length ; i++) {
            System.out.println(divide(numerator[i],denominator[i] ));
        }
        System.out.println("divide hora hai");
    }
    public static int divide(int a , int b){
        return  a/b;
    }
}
