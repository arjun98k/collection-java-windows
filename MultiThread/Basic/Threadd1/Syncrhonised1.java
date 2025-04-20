package MultiThread.Basic.Threadd1;

public class Syncrhonised1 extends Thread {

    public static void main(String[] args) {
      Counter counter = new Counter();
      Thread t1 = new Thread(()-> {
          for (int i = 0; i < 500; i++) {
              counter.increment();
          }
      });

        Thread t2 = new Thread(()-> {
            for (int i = 0; i < 500; i++) {
                counter.increment();
            }
        });

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();

        } catch (InterruptedException e) {
           e.printStackTrace();
        }
        System.out.println("final count   " + counter.getCount());

    }
}


class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;

    }
    public int getCount(){
        return count;
    }
}