package ExecutorFramework;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Excutor1 {


    public static void main(String[] args) {
        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("Available processors: " + cores);
        long starttime = System.currentTimeMillis();
        ExecutorService executor = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            int finalI = i;
            executor.submit(() ->
                    {
                        long result = factorial(finalI);
                        System.out.println(result);
                    }
            );
        }
            executor.shutdown();
            try {
                executor.awaitTermination(1, TimeUnit.SECONDS);

            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Total time " + (System.currentTimeMillis() - starttime));


        }
        private static long factorial(int n){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            long result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;


        }

    }


