package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingMultiThreadExecutor {
    public static void main(String[] args) throws InterruptedException{
        ExecutorService service = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 10; i++) {
            PrintTask task = new PrintTask((char)i);
            service.submit(task);
        }

        service.shutdown();
        System.out.println("\n**************1");
        
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){
            service.shutdownNow();
        }

        System.out.println("\n**************2");
    }
}
