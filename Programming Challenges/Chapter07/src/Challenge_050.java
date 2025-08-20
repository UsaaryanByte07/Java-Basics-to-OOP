import java.util.Scanner;

public class Challenge_050 {
    public static void main(String[] args) {
        // 50. Create a program using continue to sum all positive numbers entered by
        // the user; skip any negative numbers.
        Scanner input = new Scanner(System.in);
        int num, sum = 0;
        while (true) {
            System.out.print("Enter the Number(Enter 0 to Exit): ");
            num = input.nextInt();
            if (num == 0) {
                break;
            } else if (num < 0) {
                continue;
            }
            sum += num;
        }
        System.out.println("The Sum of All Positive Numbers Entered is " + sum + " .");
        input.close();
    }
}
