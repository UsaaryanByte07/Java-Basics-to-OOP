public class PrintThread extends Thread{

    @Override
    public void run() {
        try {
            Thread.sleep(4000);
            System.out.println(getState());
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}
