import java.util.Scanner;

public class Return_18 {
    public static Scanner input = new Scanner(System.in); // Single Scanner
    public static void main(String[] args) {
        greet();
        int first = readNumber();
        int second = readNumber();

        int sum = first + second;
        System.out.println("Sum of the numbers is: " + sum);
        input.close();
    }

    public static int readNumber() {
        System.out.print("Please enter the number: ");
        int number = input.nextInt();
        return number;
    }

    public static void greet() {
        System.out.println("Welcome to Calculator\n");
    }
}
