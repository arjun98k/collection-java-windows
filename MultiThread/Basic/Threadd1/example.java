package MultiThread.Basic.Threadd1;

public class example {
    public static void main(String[] args) {
        World word = new World();
        word.start();
        for (int i = 0; i < 10000 ; i++) {
            System.out.println("hello bhau" +" "+ Thread.currentThread().getName());
        }
    }
}
