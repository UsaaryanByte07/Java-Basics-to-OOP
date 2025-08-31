public class TestingSynchronization {
    public static void main(String[] args){
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterThread t1 = new UpdaterThread(counter);
        UpdaterThread t2 = new UpdaterThread(counter);

        t1.start();
        t2.start();
        try {
            t1.join();
            t2.join();
        } catch (InterruptedException ie) {
            System.out.println(ie.getMessage());
        }

        long endTime = System.currentTimeMillis();
        System.out.printf("The Count Value is %d and The time taken(in ms) is %d\n",counter.getCount(),(endTime-startTime));
    }
}
