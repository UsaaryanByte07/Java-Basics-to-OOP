public class TestFlyable {
    public static void main(String[] args) {
        /*
         * 66. Create an interface Flyable with an abstract method fly().
         * Create an abstract class Bird that implements Flyable.
         * Implement a subclass Eagle that extends Bird. Provide an
         * implementation for the fly() method.
         */
        Eagle eagle = new Eagle();
        eagle.fly();
    }
}
