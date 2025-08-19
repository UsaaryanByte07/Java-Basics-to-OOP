import java.util.Scanner;

public class Challenge_003 {
    public static void main(String[] args) {
        //3. Create a program to input name of the person and respond with "Welcome NAME to Java Programming".
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Welcome " + name + " to Java Programming.");
        input.close();
    }
}
