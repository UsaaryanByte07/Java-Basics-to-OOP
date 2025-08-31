import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class TestingFactorial {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        /*
         * 87. Write a program that uses an executor service to execute multiple
         * Callable tasks. Each task should calculate and return the factorial
         * of a number provided to it. Use Future objects to receive the
         * results of the calculations. After all tasks are submitted, retrieve
         * the results from the futures, print them, and ensure the executor
         * service is shut down correctly.
         */
        ExecutorService service = Executors.newFixedThreadPool(4);

        for (int i = 2; i <= 7; i++) {
            FactorialTask ft = new FactorialTask(i);
            Future<Integer> f = service.submit(ft);
            System.out.println(f.get());
        }

        service.shutdown();
    }
}
