import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import executor.PrintTask;

public class Testing {
    public static void main(String[] args) {
        /*
         * 85. Write a program that creates a single-threaded executor service.
         * Define and submit a simple Runnable task that prints numbers
         * from 1 to 10. After submission, shut down the executor.
         */
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask task = new PrintTask();

        service.submit(task);

        service.shutdown();
    }
}
