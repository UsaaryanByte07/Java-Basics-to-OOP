import java.util.Scanner;

public class Challenge_016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Integer Number: ");
        int num = input.nextInt();
        sumOfDigits(num , numLength(num));
        input.close();
    }
    
    public static int numLength(int num){
        int length = 0;
        while(num != 0){
            num /= 10;
            length++;
        }
        return length;
    }

    public static void sumOfDigits(int num,int numLength){
        int digitSum = 0;
        int tempNum = num;
        for(int i = 0; i < numLength; i++){
            digitSum += tempNum%10;
            tempNum /= 10;
        }
        System.out.println("The Sum of the Digits of the Integer Number " + num + " is " + digitSum + ".");
    }
}
