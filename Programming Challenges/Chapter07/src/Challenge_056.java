import java.util.Scanner;

public class Challenge_056 {
    public static void main(String[] args) {
        // 56. Create a number guessing game where the program selects a random number, and the user has to guess it.
        Scanner input = new Scanner(System.in);
        int num, randomNum = (int) (Math.random() * (100 - 1)) + 1, attempts = 1;
        do {
            System.out.printf("Guess the Number(1-100)[This is your Attempt No.%d]: ", attempts);
            num = input.nextInt();
            if (num == randomNum) {
                System.out.printf("You Guessed it Correctly in %d Number of Attempts!!", attempts);
                break;
            } else if (num < randomNum) {
                System.out.printf("You are Lagging Behind, Try Again!![This was your Attempt No.%d]\n", attempts);
            } else {
                System.out.printf("You are Leading Ahead, Try Again!![This was your Attempt No.%d]\n", attempts);
            }
            attempts++;
        } while (true);
        input.close();
    }
}
