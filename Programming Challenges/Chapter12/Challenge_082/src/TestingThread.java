public class TestingThread {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 82. Write a program that starts a thread and prints its state after each
         * significant event (creation, starting, and termination). Use
         * Thread.sleep() to simulate long-running tasks and Thread.getState() to
         * print the thread's state.
         */
        PrintThread thread1 = new PrintThread();
        System.out.println(thread1.getState());
        PrintThread thread2 = new PrintThread();
        System.out.println(thread1.getState());
        
        thread1.start();
        thread1.join();
        System.out.println(thread1.getState());
        thread2.start();
        thread2.join();
        System.out.println(thread2.getState());
    }
}
