import java.util.Scanner;

public class Challenge_15 {
    public static void main(String[] args) {
        //15. Write a function that calculates the factorial of a given number.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        factorial(num);
        input.close();
    }

    public static void factorial(int num){
        int fact = 1;
        for(int i = 1; i <= num; i++){
            fact *= i;
        }
        System.out.println("The factorial of " + num + " is " + fact + ".");
    }
}
