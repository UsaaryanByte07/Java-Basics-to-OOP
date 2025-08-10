import java.util.Scanner;

public class Challenge_07 {
    public static void main(String[] args) {
        //7. Create a program to calculate Compound interest.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Principal Amount(in Rupees): ");
        long p = input.nextLong();
        System.out.print("Enter the Rate of Interest(in %): ");
        float r = input.nextFloat();
        System.out.print("Enter the Time Period(in Years): ");
        int t = input.nextInt();
        System.out.print("Enter the number of times interest is compounded per year: ");
        int n = input.nextInt();

        double i = (p*Math.pow((1 + r/(100*n)), n*t)) - p;
        System.out.println("The Compound interest is Rs. " + i + ".");
        input.close();
    }
}
