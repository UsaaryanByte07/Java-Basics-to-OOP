import java.util.Scanner;

public class Challenge_06 {
    public static void main(String[] args) {
        //6. Create a program to calculate Perimeter of a rectangle.
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Length of Rectangle(in cms): ");
        float l = input.nextFloat();
        System.out.print("Enter the Breadth of Rectangle(in cms): ");
        float b = input.nextFloat();

        float p = 2*(l+b);
        System.out.println("The Perimeter of Rectangle is " + p + " cm.");
        input.close();
    }
}
