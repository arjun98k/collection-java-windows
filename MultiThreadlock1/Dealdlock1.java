package MultiThreadlock1;

public class Dealdlock1 {
    static  class Resources{
        String name;
        Resources(String name){
            this.name = name;
        }
    }
    private  static final Resources pen = new Resources("pen");
    private static  final Resources paper = new Resources("paper");

    public static void main(String[] args) {

        Thread threadA = new Thread(() -> {
            synchronized (pen) {
                System.out.println("Thread A: Holding Pen...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException ignored) {
                }
                System.out.println("Thread A: Waiting for Paper...");
                synchronized (paper) {
                    System.out.println("Thread A: Got Paper!");
                }
            }

        });

        Thread threadB = new Thread(()->
        {
            synchronized (paper) {
                System.out.println("Thread B: Holding Paper...");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException igonored) {
                }
                System.out.println("Thread B: waiting for Pen...");
                synchronized (pen) {
                    System.out.println("Thread B: Got Pen!");

                }
            }
        });

         threadA.start();
         threadB.start();

    }
}
