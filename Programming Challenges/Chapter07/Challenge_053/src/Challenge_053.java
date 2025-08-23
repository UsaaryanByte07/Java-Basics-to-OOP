import java.util.Scanner;

public class Challenge_053 {
    public static void main(String[] args) {
        // 53. Concatenate and Convert: Take two strings, concatenate them, and convert
        // the result to uppercase.

        Scanner input = new Scanner(System.in);
        System.out.print("Enter String 1: ");
        String str1 = input.nextLine();
        System.out.print("Enter String 1: ");
        String str2 = input.nextLine();
        System.out.printf("%S%S", str1, str2);
        input.close();
    }
}
