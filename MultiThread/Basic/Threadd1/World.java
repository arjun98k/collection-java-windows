package MultiThread.Basic.Threadd1;

public class World extends Thread {
    @Override
    public void run() {
        for (int i = 0; i <10000 ; i++) {
            System.out.println("world of arjun " + Thread.currentThread().getName());
        }
    }
}
