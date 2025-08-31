public class PrintThread extends Thread{
    private final int threadNumber;
    PrintThread(int threadNumber){
        this.threadNumber = threadNumber;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("\nHello from Thread %d",threadNumber);
        }
    }
}
