import java.util.Scanner;
import java.util.function.BinaryOperator;

public class Multiplication {
    public static void main(String[] args) {
        /*
         * 88. Write a lambda expression that takes two integers and
         * returns their multiplication. Then, apply this lambda to a
         * pair of numbers.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = input.nextInt();

        BinaryOperator<Integer> product = (x,y) -> x*y;
        System.out.printf("The Product of %d and %d is %d\n",num1,num2,product.apply(num1,num2));
        input.close();
    }
}
