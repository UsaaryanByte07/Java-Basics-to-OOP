import java.util.Scanner;

public class Challenge_013 {
    public static void main(String[] args) {
        //13. Develop a program that prints the multiplication table for a given number.
        
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        printTable(num);
        input.close();
    }

    public static void printTable(int num){
        System.out.println("The Table of " + num + " is: ");
        for(int i = 0; i < 10; i++){
            System.out.println(num + " x " + (i+1) + " = " + (num*(i+1)));
        }
    }
}
