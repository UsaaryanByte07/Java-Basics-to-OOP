public class ExtendingThreadClass{
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        FirstTask t1 = new FirstTask();
        SceondTask t2 = new SceondTask();
        ThirdTask t3 = new ThirdTask();

        System.out.println("\nStarting First Task");
        t1.start();
        System.out.println("\nStarting Sceond Task");
        t2.start();
        System.out.println("\nStarting Third Task");
        t3.start();

        long end = System.currentTimeMillis();

        System.out.printf("%s Total Time Taken(in ms): %d\n",Thread.currentThread().getName(),(end-start));
    }
}