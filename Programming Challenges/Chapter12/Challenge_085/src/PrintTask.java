package executor;

public class PrintTask implements Runnable{
    @Override
    public void run() {
        //Print Task
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d ",i);
        }
    }
}
