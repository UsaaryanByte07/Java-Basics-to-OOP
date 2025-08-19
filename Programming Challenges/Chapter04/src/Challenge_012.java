import java.util.Scanner;

public class Challenge_012 {
    public static void main(String[] args) {
        //12. Write a program to check if a given number is even or odd using bitwise operators.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        if ((num & 1) == 1) {
            System.out.println("Your number is odd");
        } else {
            System.out.println("Your number is even");
        }
        input.close();
    }
}
