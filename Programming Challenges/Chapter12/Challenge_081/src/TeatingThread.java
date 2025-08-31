public class TeatingThread {
    public static void main(String[] args) {
        /*
         * 81. Write a program that creates two threads. Each thread should print
         * "Hello from Thread X", where X is the number of the thread (1 or 2),
         * ten times, then terminate.
         */
        PrintThread thread1 = new PrintThread(1);
        PrintThread thread2 = new PrintThread(2);

        thread1.start();
        thread2.start();
    }
}
