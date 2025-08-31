public class SceondTask extends Thread{
    @Override
    public void run() {
        //2nd Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.printf("\n%s # Task Completed",Thread.currentThread().getName());
    }
}
