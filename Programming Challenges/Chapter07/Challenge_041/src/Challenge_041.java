import java.util.Scanner;

public class Challenge_041 {
    public static void main(String[] args) {
        // 41. Create a program to find if the given number is even or odd.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        System.out.println(
                num % 2 == 0 ? "The Number " + num + " is a Even Number" : "The Number " + num + " is a Odd Number.");
        input.close();
    }
}
