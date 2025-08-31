import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testing {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 86. Create a fixed thread pool with a specified number of threads
         * using Executors.newFixedThreadPool(int). Submit multiple tasks
         * to this executor, where each task should print the current thread's
         * name and sleep for a random time between 1 and 5 seconds.
         * Finally, shut down the executor and handle proper termination
         * using awaitTermination
         */
        ExecutorService service = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 5; i++) {
            Task t = new Task();
            service.submit(t);
            System.out.printf("\nThread-%d is Active",i);
        }
        if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
            service.shutdownNow();
        }
    }
}
