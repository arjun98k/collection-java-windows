package ExecutorFramework;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class Schedul1 {
    public static void main(String[] args) {
        ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        scheduler.scheduleAtFixedRate(
                ()-> System.out.println("Task executed every 5 second"),
                5,
                5,
                TimeUnit.SECONDS
        );

        scheduler.schedule(
                ()-> {
                    System.out.println("intiating shutdown");
                    scheduler.shutdown();},
                    20,
                    TimeUnit.SECONDS);


    }

}
