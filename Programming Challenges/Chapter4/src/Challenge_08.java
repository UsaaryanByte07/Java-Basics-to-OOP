import java.util.Scanner;

public class Challenge_08 {
    public static void main(String[] args) {
        //8. Create a program to convert Fahrenheit to Celsius

        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the Temperature in Fahrenheit: ");
        float f = input.nextFloat();
        float c = (f - 32) * ((float)5/(float)9);
        System.out.println("The Temperature in Celsuis is " + c + ".");
        input.close();
    }
}
