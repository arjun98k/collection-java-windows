package MultiThread.Basic.Threadd1;

public class PriorityThread1 extends Thread {
   public PriorityThread1(String name) {
       super(name);
   }
    @Override
    public void run() {
        System.out.println("thread is running ...");
        for (int i = 0; i <= 5 ; i++) {
            String a = "";
            for (int j = 0; j < 5 ; j++) {
                a += "a";
                System.out.println(Thread.currentThread().getName() + " - Priority: " + Thread.currentThread().getPriority() + " - count: " + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void main(String[] args) {

       PriorityThread1 l = new PriorityThread1("low priority T1");
        PriorityThread1 m = new PriorityThread1("medium priority T2");
        PriorityThread1 n = new PriorityThread1("high priority T3");
        l.setPriority(Thread.MIN_PRIORITY);
        m.setPriority(Thread.NORM_PRIORITY);
        n.setPriority(Thread.MAX_PRIORITY);
        l.start();
        m.start();
        n.start();
    }
}
