public class TestingThread {
    public static void main(String[] args) throws InterruptedException {
        /*
         * 83. Create three threads. Ensure that the second thread starts only after
         * the first thread ends and the third thread starts only after the second
         * thread ends using the join method. Each thread should print its start
         * and end along with its name.
         */
        PrintThread thread1 = new PrintThread();
        PrintThread thread2 = new PrintThread();

        thread1.start();
        System.out.printf("\n%s has Started", thread1.getName());
        thread1.join();
        System.out.printf("\n%s has Ended", thread1.getName());
        thread2.start();
        System.out.printf("\n%s has Started", thread2.getName());
        thread2.join();
        System.out.printf("\n%s has Ended", thread2.getName());
    }
}
