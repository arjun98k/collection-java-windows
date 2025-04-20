package MultiThread.Basic.Threadd1;

public class DaemonThread extends Thread {
public void run(){
    while (true){
        System.out.println("hello arjun");
    }
}

    public static void main(String[] args) {
        DaemonThread t1 = new DaemonThread();
         t1.setDaemon(true);
         t1.start();
    }
}
