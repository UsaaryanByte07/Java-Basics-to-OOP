import java.util.Scanner;

public class Challenge_25 {
    public static void main(String[] args) {
        //25. Create a program to check if a number is an Armstrong number.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        checkArmstrong(num);
        input.close();
    }

    public static int numberOfDigitsInNum(int num){
        int numberOfDigits = 0;
        while(num != 0){
            num /= 10;
            numberOfDigits++;
        }
        return numberOfDigits;
    }

    public static void checkArmstrong(int num){
        int numberOfDigits = numberOfDigitsInNum(num);
        int sumOfDigits = 0;
        int tempNum = num;
        for(int i = 0; i < numberOfDigits; i++){
            int digit = tempNum%10;
            tempNum /= 10;
            sumOfDigits += Math.pow(digit,numberOfDigits);
        }
        if(sumOfDigits == num){
            System.out.println("The Number " + num + " is a Armstrong Number.");
        }else{
            System.out.println("The Number " + num + " is not a Armstrong Number.");
        }
    }
}
