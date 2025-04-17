package MultiThread.Basic.Threadd1;

public class example {
    public static void main(String[] args) {
//        through thread class
//        World word = new World();
//        word.start();

        World word = new World();
        Thread t1 = new Thread(word);
                t1.start();
        for (int i = 0; i < 10000 ; i++) {
            System.out.println("hello bhau" +" "+ Thread.currentThread().getName());
        }
    }
}
