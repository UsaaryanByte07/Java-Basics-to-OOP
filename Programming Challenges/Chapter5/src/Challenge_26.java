import java.util.Scanner;

public class Challenge_26 {
    public static void main(String[] args) {
        //26. Create a program to check that the Number is a Palindrome or not.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        checkPalindrome(num);
        input.close();
    }

    public static int reverseTheNum(int num){
        int reverseNum = 0;
        int originalNum = num;
        while(num != 0){
            int digit = num % 10;
            reverseNum = reverseNum * 10 + digit;
            num /= 10;
        }
        System.out.println("The Reverse Number of the entered number is " + reverseNum + ".");
        return reverseNum;
    }

    public static void checkPalindrome(int num){
        if(num == reverseTheNum(num)){
            System.out.println("The Number Entered is a Palindrome.");
        }else{
            System.out.println("The Number Entered is not a Palindrome.");
        }
    }
}
