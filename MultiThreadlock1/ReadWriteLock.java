package MultiThreadlock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class ReadWriteLock {
private int count = 0;
private final java.util.concurrent.locks.ReadWriteLock lock = new ReentrantReadWriteLock();
private final Lock readlock = lock.readLock();
private final Lock writelock = lock.writeLock();

public void increment(){
    writelock.lock();
    try {
        count++;
        Thread.sleep(50);
    } catch (InterruptedException e) {
        throw new RuntimeException(e);
    } finally {
        writelock.unlock();
    }
}

public  int getcount(){
    readlock.lock();
    try {
        return count;
    }finally {
        readlock.unlock();
    }
}

    public static void main(String[] args) throws InterruptedException {

    ReadWriteLock counter= new ReadWriteLock();

        Runnable readTask = new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println(Thread.currentThread().getName() + " read: " + counter.getcount());
                }
            }
        };

    Runnable writerTask= new Runnable() {
        @Override
        public void run() {
            for (int i = 0; i <10 ; i++) {
                counter.increment();
                System.out.println(Thread.currentThread().getName() + " read: " + counter.getcount());
            }
        }
    };
    Thread writerThread = new Thread(writerTask);
        Thread readerThread1 = new Thread(readTask);
        Thread readerThread2 = new Thread(readTask);

        writerThread.start();
        readerThread1.start();
        readerThread2.start();

        writerThread.join();
        readerThread1.join();
        readerThread2.join();

        System.out.println("final count: " + counter.getcount());
    }
}
