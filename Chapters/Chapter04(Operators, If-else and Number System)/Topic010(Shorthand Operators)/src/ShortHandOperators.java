import java.util.Scanner;

public class ShortHandOperators {
    public static void main(String[] args) {
        int a = 5;
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        int x2 = input.nextInt();
        int x3 = input.nextInt();
        int x4 = input.nextInt();
        a += x4 + x3 + x2 +x1;
        System.out.println(a);
        input.close();
    }
}
