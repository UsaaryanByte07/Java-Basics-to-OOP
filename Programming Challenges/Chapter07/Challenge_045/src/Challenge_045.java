import java.util.Scanner;

public class Challenge_045 {
    public static void main(String[] args) {
        // 45. Create a program to create a simple calculator that uses a switch
        // statement to perform basic arithmetic operations like addition, subtraction,
        // multiplication, and division.
        Scanner input = new Scanner(System.in);
        int result, num1, num2, choice;
        while (true) {
            System.out.print(
                    "Welcome To Calculator Following are the Choices:\n1. Addition\n2. Substraction\n3. Division\n4. Multipliation\n5. Exit\nEnter Your Choice: ");
            choice = input.nextInt();
            switch (choice) {
                case 1:
                    System.out.print("Enter 1st Number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    num2 = input.nextInt();
                    System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.print("Enter 1st Number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    num2 = input.nextInt();
                    System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.print("Enter 1st Number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    num2 = input.nextInt();
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                    } else {
                        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                    }
                    break;
                case 4:
                    System.out.print("Enter 1st Number: ");
                    num1 = input.nextInt();
                    System.out.print("Enter 2nd Number: ");
                    num2 = input.nextInt();
                    System.out.println(num1 + " x " + num2 + " = " + (num1 * num2));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    input.close();
                    return;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
