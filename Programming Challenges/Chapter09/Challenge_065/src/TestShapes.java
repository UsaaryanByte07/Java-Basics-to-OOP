public class TestShapes {
    public static void main(String[] args) {
        /*
         * 65. Create an abstract class Shape with an abstract method
         * calculateArea(). Implement two subclasses: Circle and
         * Square. Each subclass should have relevant attributes (like
         * radius for Circle, side for Square) and their own
         * implementation of the calculateArea() method.
         */
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of Circle is %5.2f\n", circle.calculateArea());
        System.out.printf("Area of Square is %5.2f\n", square.calculateArea());
    }
}
