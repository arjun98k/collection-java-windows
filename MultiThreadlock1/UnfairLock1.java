package MultiThreadlock1;

import java.util.concurrent.locks.ReentrantLock;

public class UnfairLock1 {
private static final ReentrantLock lock = new ReentrantLock(false);


    public static void main(String[] args) {
        for (int i = 1; i <=5; i++) {
            final int threadId = i;
            Thread t = new Thread(() -> {
                for (int j = 0; j <3 ; j++) {
                    lock.lock();
                    try {
                        System.out.println("Thread " + threadId + " got the lock thread");
                        try {
                            Thread.sleep(100);
                        } catch (InterruptedException e) {
                            Thread.currentThread().interrupt();
                        }
                    } finally {
                        lock.unlock();
                    }
                    try {
                        Thread.sleep(50);
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                    }
                }
            });
            t.start();

        }
    }
}
