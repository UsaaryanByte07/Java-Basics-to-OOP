import java.util.Scanner;

public class ArithematicException {
    public static void main(String[] args) {
        /*
         * 69. Arithmetic Exception Handling
         * Write a program that asks the user to enter two integers and
         * then divides the first by the second. The program should
         * handle any arithmetic exceptions that may occur (like
         * division by zero) and display an appropriate message.
         * Key Points:
         * •Use Scanner to read user input.
         * •Implement a try-catch block to handle ArithmeticException.
         * •Display a user-friendly message if division by zero occurs.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = input.nextInt();

        try {
            int result = num1 / num2;
            System.out.println("The Result of division is " + result + ".");
        } catch (ArithmeticException e) {
            if (e.getMessage()
                    .equals("/ by zero")) {
                System.out.println("Divide by zero occurred.");
            } else {
                throw e;
            }
        }
    }
}
