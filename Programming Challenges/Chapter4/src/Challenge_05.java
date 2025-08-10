import java.util.Scanner;

public class Challenge_05 {
    public static void main(String[] args) {
        //5. Create a program to swap two numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Value of 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the Value of 2nd Number: ");
        int num2 = input.nextInt();
        System.out.println("Before Swapping Number 1 and 2 are " + num1 + " and " + num2 + " .");
        int temp = num1;
        num1 = num2;
        num2 = temp;
        System.out.println("After Swapping Number 1 and 2 are " + num1 + " and " + num2 + " .");
        input.close();
    }
}
