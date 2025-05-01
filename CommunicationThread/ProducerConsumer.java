package CommunicationThread;

class Shared{
    private int number;
    private boolean ready = false;

    public synchronized void produce(int value){
        while (ready){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        number = value;
        ready = true;
        System.out.println("produced: " + number);
        notify();
    }

    public synchronized void consume() {
        while (!ready){
            try {
                wait();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println("consumed: "+ number);
        ready = false;
        notify();
    }
}

public class ProducerConsumer {


    public static void main(String[] args) {
        Shared share = new Shared();
        //Producer
        Thread producer = new Thread(()-> {
            for (int i = 0; i <= 5 ; i++) {
                share.produce(i);
            }
        }
        );
        // Comsumer Thread
        Thread consumer = new Thread(()->
        {
            for (int i = 0; i <=5 ; i++) {
                share.consume();
            }
        }
                );

        producer.start();
        consumer.start();

    }
}
