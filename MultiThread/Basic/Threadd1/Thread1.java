package MultiThread.Basic.Threadd1;

public class Thread1 extends Thread {
    @Override
    public void run() {
        System.out.println("something happening 2nd thread "+ Thread.currentThread().getName() );
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1();
        System.out.println(t1.getState());
        t1.start();
        System.out.println(t1.getState());
        Thread.sleep(500);
        System.out.println(t1.getState());
    }
}
