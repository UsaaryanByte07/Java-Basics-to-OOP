public class NeedOfMultiThreading {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();

        //1st Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n* Task Completed");

        //2nd Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\n# Task Completed");

        //3rd Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n$ Task Completed");

        long end = System.currentTimeMillis();

        System.out.printf("Total Time Taken(in ms): %d\n",(end-start));
    }
}
