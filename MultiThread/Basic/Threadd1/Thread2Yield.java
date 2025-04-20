package MultiThread.Basic.Threadd1;

public class Thread2Yield extends Thread{

    public Thread2Yield(String name){
        super(name);
    }
    public void run(){
        for (int i = 0; i < 5 ; i++) {
            System.out.println(Thread.currentThread().getName() + "is running..");
            Thread.yield();
        }
    }

    public static void main(String[] args) {
        Thread2Yield t1 = new Thread2Yield("T1 ");
        Thread2Yield t2 = new Thread2Yield("T2 ");
        t1.start();
        t2.start();
    }
    }

