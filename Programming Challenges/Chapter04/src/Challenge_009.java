import java.util.Scanner;

public class Challenge_009 {
    public static void main(String[] args) {
        //9. Create a program that determines the greatest of the three numbers

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = input.nextInt();
        System.out.print("Enter the 3rd Number: ");
        int num3 = input.nextInt();

        if((num1 > num2) && (num1 > num3)){
            System.out.println("The Number " + num1 + " is the Greatest.");
        }else if((num2 > num1) && (num2 > num3)){
            System.out.println("The Number " + num2 + " is the Greatest.");
        } else if ((num3 > num1) && (num3 > num2)){
            System.out.println("The Number " + num3 + " is the Greatest.");
        } else{
            System.out.println("All three Numbers are Equal.");
        }
        input.close();
    }
}
