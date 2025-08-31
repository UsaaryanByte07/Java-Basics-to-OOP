public class Task implements Runnable{
    @Override
    public void run() {
        try {
            Thread.sleep((1 + (int)(Math.random()*((5-1) + 1)))*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
