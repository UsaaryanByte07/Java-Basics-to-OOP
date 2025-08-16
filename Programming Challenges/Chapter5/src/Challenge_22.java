import java.util.Scanner;

public class Challenge_22 {
    public static void main(String[] args) {
        //22. Create a program to reverse the digits of a number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        reverseTheNum(num);
        input.close();
    }

    public static void reverseTheNum(int num){
        int reverseNum = 0;
        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        System.out.println("The Reverse Number of the entered number is " + reverseNum + ".");
    }
}