package MultiThreadlock1;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class BankaccountLock {
private int balance = 100;
private final Lock lock = new ReentrantLock();

public  void withdraw(int amount){
    if (lock.tryLock()){
        try {
            if (balance >= amount){
                System.out.println(Thread.currentThread().getName()+ " is withdrawing " + amount);
                balance-= amount;
                System.out.println("New balance: " + balance);
            } else {
                System.out.println("Not enough balance for " + Thread.currentThread().getName());
            }
        } finally {
            lock.unlock();
        }
    } else {
        System.out.println(Thread.currentThread().getName() + " couldn't get the lock, try again later.");
    }
}

    public static void main(String[] args) {
BankaccountLock account1 = new BankaccountLock();
Runnable task = ()->account1.withdraw(70);
Thread t1 = new Thread(task, "Thread 1");
        Thread t2 = new Thread(task, "Thread 2");
        t1.start();
        t2.start();

    }
}


//Sure! Let’s break down **both versions** of the code step by step, so you can clearly see what’s happening and how they differ in terms of locking and thread control.
//
//---
//
//        ## 🔹 Version 1: Using `synchronized`
//
//        ### Code Summary:
//        ```java
//public synchronized void withdraw(int amount) {
//```
//
//    The `withdraw` method is marked as `synchronized`, which means **only one thread can execute it at a time** for the same object.
//
//### What Happens:
//    1. Two threads (`Thread 1` and `Thread 2`) try to call the `withdraw(70)` method **on the same account object**.
//    2. Since `withdraw` is `synchronized`, Java uses the intrinsic **monitor lock** of the `BankAccountSynchronized` object.
//    3. If one thread is executing the method, the **other thread has to wait**.
//    4. Inside the method:
//    - It checks if balance is enough.
//            - If yes, it withdraws and prints the new balance.
//            - If not, it shows a message saying "Not enough balance".
//    5. Both threads try to withdraw 70 from an initial balance of 100.
//            - First thread succeeds: 100 - 70 = 30
//            - Second thread sees balance 30 < 70 → prints insufficient funds.
//
//### 🔐 Locking is automatic
//            - Java handles the locking/unlocking internally.
//            - No `unlock()` is needed.
//
//    ---
//
//## 🔹 Version 2: Using `Lock` (ReentrantLock with `tryLock()`)
//
//### Code Summary:
//```java
//    if (lock.tryLock()) {
//        try {
//            // Critical section
//        } finally {
//            lock.unlock();
//        }
//    }
//```
//
//    Here we use an **explicit `Lock` object** instead of `synchronized`.
//
//### What Happens:
//    1. Two threads (`Thread A` and `Thread B`) try to call `withdraw(70)` on the same account.
//    2. The method uses `lock.tryLock()`:
//    - This attempts to acquire the lock **without blocking**.
//    - If the lock is available, it goes into the `try` block.
//            - If another thread holds the lock, it **skips** and prints a message like:
//     ```
//    Thread B couldn't get the lock, try again later.
//     ```
//    3. Inside the locked section:
//    - Checks if balance is enough
//            - Withdraws and prints the new balance
//    4. After executing, the thread **must release the lock manually** with `lock.unlock()` in a `finally` block.
//    5. So again, only one thread can safely withdraw, and the other might:
//    - Either wait (if using `lock.lock()`), or
//            - Skip (because we used `tryLock()`).
//
//            ---
//
//## 🧠 Key Learning:
//
//| Concept                  | synchronized                         | Lock (`ReentrantLock`)                   |
//            |--------------------------|--------------------------------------|------------------------------------------|
//            | Lock acquisition         | Automatic                            | Manual with `tryLock()` or `lock()`      |
//| Waiting behavior         | Always waits until lock is free      | `tryLock()` doesn't wait                 |
//            | Unlocking                | Handled by JVM                       | You must call `unlock()` manually        |
//            | Flexibility              | Basic (good for simple cases)        | Advanced (good for complex logic)        |
//
//    ---
//
//            Would you like a version where we actually use a `Condition` to show advanced waiting/signaling behavior too?
