package MultiThread.Basic.Threadd1;

public class DaemonThread extends Thread {
public void run(){
    while (true){
        System.out.println("hello arjun");
    }
}

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
        DaemonThread t2 = new DaemonThread();
         t1.setDaemon(true); // DaemonThread is now daemonthread like (Garbage Collector) now
         t1.start();
         t2.start();
        System.out.println("main thread");

    }
}
