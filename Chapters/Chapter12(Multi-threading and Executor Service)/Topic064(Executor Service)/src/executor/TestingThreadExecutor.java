package executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class TestingThreadExecutor {
    public static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintTask t1 = new PrintTask('*');
        PrintTask t2 = new PrintTask('$');
        PrintTask t3 = new PrintTask('#');

        service.submit(t1);
        service.submit(t2);
        service.submit(t3);

        service.shutdown();
    }
}
