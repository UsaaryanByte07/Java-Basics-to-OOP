import java.util.Scanner;

public class Challenge_021 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //21. Create a program to check whether a given number is prime.
        System.out.print("Enter the Number: ");
        int num = input.nextInt();
        checkPrime(num);
        input.close();
    }

    public static boolean checkPrime(int num){
        if(num<=1){
            System.out.println("The Given Number " + num + " is not Prime.");
            return false;
        }

        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num%i==0){
                System.out.println("The Entered Number " + num + " is not Prime.");
                return false;
            }
        }
        System.out.println("The Entered Number " + num + " is Prime.");
        return true;
    }

}
