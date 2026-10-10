package AdvanceJava;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class AsyncPipelineDemo {

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        System.out.println("🚀 Starting asynchronous data aggregation...\n");

        CompletableFuture<String> userFuture = CompletableFuture.supplyAsync(() -> {
            sleep(1000); 
            System.out.println("👤 Fetched user profile.");
            return "User: Alice (ID: 42)";
        });

    
        CompletableFuture<String> ordersFuture = CompletableFuture.supplyAsync(() -> {
            sleep(1500); 
            System.out.println("📦 Fetched user orders.");
            return "Orders: [Laptop, Mouse, Keyboard]";
        });

   
        CompletableFuture<Void> combinedFuture = userFuture.thenCombine(ordersFuture, (user, orders) -> {
            return "\n=== Dashboard Summary ===\n" + user + "\n" + orders;
        }).thenAccept(result -> {
            System.out.println(result);
        });

        try {
            combinedFuture.get(); 
        } catch (InterruptedException | ExecutionException e) {
            System.err.println("❌ Error in async pipeline: " + e.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.println("\n⏱️ Total execution time: " + (endTime - startTime) + " ms");
        System.out.println("(Notice it took ~1.5s total instead of 2.5s because tasks ran concurrently!)");
    }

    private static void sleep(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}