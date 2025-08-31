public class TestingPriority {
    public static void main(String[] args) throws InterruptedException {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        // In using Multi-threading by extending thread class we use to declare the
        // object itself as a thread and call method start()
        // By while using multi-threading by implementing Runnable interface we need to
        // create a Runnable object and pass it to a Thread
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        System.out.println("\nThread 1 Started");
        t2.start();
        System.out.println("\nThread 2 Started");
        t2.join(); // Here we have called join() method from main thread.. hence main thread will
                   // wait for thread 2 to die
        /*
         * •join(): Waits indefinitely until the thread on which
         *          it's called finishes.
         * •join(long millis): Waits for the thread to die for the
         *                     specified milliseconds.
         * •join(long millis, int nanos): Waits for the thread to die for the specified 
         *                                milliseconds plus nanoseconds.
         */
        t3.start();
        System.out.println("\nThread 3 Started");
    }
}
