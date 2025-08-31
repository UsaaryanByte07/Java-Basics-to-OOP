public class Counter {
    private int count = 0;

    synchronized void increment(){
        count++;
    }

    int getCount(){
        return count;
    }
}
