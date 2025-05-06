package ExecutorFramework;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class future2 {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        Callable<Integer>  call1= ()-> 2;
        Callable<Integer>  call2= ()-> 3;
        Callable<Integer>  call3= ()-> 4;

        List<Callable<Integer>> list = Arrays.asList(call1,call2,call3);
        List<Future<Integer>> futures = executorService.invokeAll(list);
        for (Future<Integer> future : futures) {
            System.out.println("Result: " + future.get());
        }
        executorService.shutdown();



    }
}
