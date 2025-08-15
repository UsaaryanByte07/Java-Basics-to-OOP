import java.util.Scanner;

public class Challenge_14 {
    public static void main(String[] args) {
        //14. Create a program to sum all odd numbers from 1 to a specified number N.
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        sumOddNum(num);
        input.close();
    }

    public static void sumOddNum(int num){
        int sum = 0;
        for(int i = 1; i <= num; i++){
            if(i%2 != 0){
                sum += i;
            }
        }
        System.out.println("The Sum of all the Odd Numbers from 1 to " + num + " is " + sum + ".");
    }
}
