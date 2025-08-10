import java.util.Scanner;

public class Challenge_04 {
    public static void main(String[] args) {
        //4. Create a program to add two numbers.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int n1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int n2 = input.nextInt();
        int sum = n1 + n2;

        System.out.println("The Sum of the given two Numbers is " + sum + ".");
        input.close();
    }
}
