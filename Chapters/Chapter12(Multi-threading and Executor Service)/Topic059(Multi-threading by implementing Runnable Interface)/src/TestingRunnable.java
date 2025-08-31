public class TestingRunnable {
    public static void main(String[] args) {
        PrintTask p1 = new PrintTask('*');
        PrintTask p2 = new PrintTask('$');
        PrintTask p3 = new PrintTask('#');

        //In using Multi-threading by extending thread class we use to declare the object itself as a thread and call method start()
        //By while using multi-threading by implementing Runnable interface we need to create a Runnable object and pass it to a Thread
        Thread t1 = new Thread(p1);
        Thread t2 = new Thread(p2);
        Thread t3 = new Thread(p3);

        t1.start();
        t2.start();
        t3.start();
    }
}
