package AdvanceJava;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;


public class ProducerConsumerDemo {

    private static final BlockingQueue<Integer> taskQueue = new ArrayBlockingQueue<>(5);

    public static void main(String[] args) {
       
        ExecutorService executor = Executors.newFixedThreadPool(2);


        Runnable producer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    System.out.println("📦 Producing item: " + i);
                    taskQueue.put(i);
                    Thread.sleep(500); 
                }
                System.out.println("✅ Production complete.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Producer was interrupted.");
            }
        };

        Runnable consumer = () -> {
            try {
                for (int i = 1; i <= 10; i++) {
                    Integer item = taskQueue.take(); 
                    System.out.println("⚙️ Consuming item: " + item);
                    Thread.sleep(1000); 
                }
                System.out.println("✅ Consumption complete.");
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println("Consumer was interrupted.");
            }
        };
        executor.submit(producer);
        executor.submit(consumer);
        executor.shutdown();
    }
}