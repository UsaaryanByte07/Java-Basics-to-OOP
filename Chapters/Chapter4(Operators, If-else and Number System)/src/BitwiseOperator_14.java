import java.util.Scanner;

public class BitwiseOperator_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter the 1st number: ");
        int num1 = input.nextInt();
        System.out.print("Now, enter the 2nd number: ");
        int num2 = input.nextInt();

        int resultBitwiseAnd = num1 & num2;
        System.out.println("Result of Bitwise AND is: " + resultBitwiseAnd);
        int resultBitwiseOr = num1 | num2;
        System.out.println("Result of Bitwise OR is: " + resultBitwiseOr);
        int resultBitwiseXor = num1 ^ num2;
        System.out.println("Result of Bitwise XOR is: " + resultBitwiseXor);
        int resultBitwiseCompliment = ~num1;
        System.out.println("Result of Bitwise Compliment is: " + resultBitwiseCompliment);
        int resultBitwiseLeftShift = num1 << 2;
        System.out.println("Result of Bitwise Left shift is: " + resultBitwiseLeftShift);
        int resultBitwiseRightShift = num1 >> 2;
        System.out.println("Result of Bitwise Right shift is: " + resultBitwiseRightShift);
        input.close();
    }
}
