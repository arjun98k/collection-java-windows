package MultiThreadlock1;

public class synchronize {
    private int balance = 100;
    public synchronized  void withdraw(int amount){
        if (balance >= amount){
            System.out.println(Thread.currentThread().getName() + " is withdrawing ... " + amount);
            balance = balance - amount;
            System.out.println("new balance: " + balance);

        } else {
            System.out.println("not enough balance fro " + Thread.currentThread());
        }
    }

    public static void main(String[] args) {
        synchronize account = new synchronize();
        Runnable task = () -> account.withdraw(70);
        Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();

    }
}
