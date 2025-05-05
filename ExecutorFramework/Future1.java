package ExecutorFramework;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Future1 {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Future<Integer> submit = executorService.submit(()-> 1+2);
        Integer i = submit.get();
        System.out.println("sum is " +  i);
        executorService.shutdown();
        Thread.sleep(1);
        System.out.println(executorService.isTerminated());
    }
}
