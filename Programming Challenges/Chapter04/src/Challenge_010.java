import java.util.Scanner;

public class Challenge_010 {
    public static void main(String[] args) {
        //10. Create a program that determines if a given year is a leap year.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Year: ");
        int year = input.nextInt();
        if((year%4 == 0 && year%100 != 0) || year%400 == 0){
            System.out.println("The given year is a Leap year.");
        }else{
            System.out.println("The given year is not a Leap year.");
        }
        input.close();
    }
}
