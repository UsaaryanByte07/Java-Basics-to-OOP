public class PrintTask implements Runnable{
    @Override
    public void run() {
        //Print Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d%c ",i,target);
        }
        System.out.printf("\n%s %c Task Completed",Thread.currentThread().getName(),target);
    }

    private final char target;

    PrintTask(char target){
        this.target = target;
    }
}
