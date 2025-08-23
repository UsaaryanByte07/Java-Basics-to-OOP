import java.util.Scanner;

public class Challenge_055 {
    public static void main(String[] args) {
        // 55. Simulate a dice roll using Math.random() and display the outcome (1 to 6).
        Scanner input = new Scanner(System.in);
        int wantToRoll = 1;
        while (wantToRoll != 0) {
            System.out.print("Enter 1 if you want to roll and 0 if you want to exit: ");
            wantToRoll = input.nextInt();
            if (wantToRoll == 0) {
                System.out.println("Exiting...");
            } else if (wantToRoll == 1) {
                int max = 6;
                int min = 1;
                int numOnDice = (int) (Math.random() * (max - min + 1)) + min;
                System.out.printf("The Number on Dice is %d.\n", numOnDice);
            } else {
                System.out.println("Enter a valid input!!");
            }
        }
        input.close();
    }
}
