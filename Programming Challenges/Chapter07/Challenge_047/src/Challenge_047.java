import java.util.Scanner;

public class Challenge_047 {
    public static void main(String[] args) {
        //47. Create a program using do-while to implement a number guessing game.
        Scanner input = new Scanner(System.in);
        int num;
        do{
            System.out.print("Enter the Number: ");
            num = input.nextInt();
            if(num == 56){
                System.out.println("You Guessed it Correctly!!");
                break;
            }else if(num < 56){
                System.out.println("You are Lagging Behind, Try Again!!");
            }else{
                System.out.println("You are Leading Ahead, Try Again!!");
            }
        }while(true);
        input.close();
    }
}
