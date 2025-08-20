import java.util.Scanner;

public class Challenge_054 {
    public static void main(String[] args) {
        // 54. Calculate the area and circumference of a circle for a given radius using
        // Math.PI
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Raduis of Circle(in m): ");
        float raduis = input.nextFloat();
        System.out.printf("The Circumference of the Circle with Raduis %.2f is %.2fm.", raduis, 2 * raduis * Math.PI);
        input.close();
    }
}
