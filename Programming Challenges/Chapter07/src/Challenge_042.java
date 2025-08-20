import java.util.Scanner;

public class Challenge_042 {
    public static void main(String[] args) {
        // 42. Create a program to calculate the absolute value of a given integer.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer: ");
        int num = input.nextInt();
        System.out.print("The Absolute value of " + num + " is ");
        num = num < 0 ? -num : num;
        System.out.println(num + ".");
        input.close();
    }
}
