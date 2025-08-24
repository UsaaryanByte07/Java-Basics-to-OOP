public class Calculator {
    /*
     * 67. In a class Calculator, create multiple add() methods that
     * overload each other and can sum two integers, three
     * integers, or two doubles. Demonstrate how each can be
     * called with different numbers of parameters
     */

    private void add(double a, double b) {
        System.out.printf("The sum of %.2f and %.2f is %.2f\n", a, b, a + b);
    }

    private void add(int a, int b, int c) {
        System.out.printf("The sum of %d, %d, and %d is %d\n", a, b, c, a + b + c);
    }

    private void add(int a, int b) {
        System.out.printf("The sum of %d and %d is %d\n", a, b, a + b);
    }

    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(8.99, 12.78);
        c.add(3, 4);
        c.add(3, 5, 6);
    }
}
