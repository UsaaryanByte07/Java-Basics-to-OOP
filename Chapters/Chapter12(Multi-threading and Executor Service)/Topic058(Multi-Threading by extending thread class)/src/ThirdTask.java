public class ThirdTask extends Thread{
    @Override
    public void run() {
        //3rd Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n%s $ Task Completed", Thread.currentThread().getName());
    }
}
