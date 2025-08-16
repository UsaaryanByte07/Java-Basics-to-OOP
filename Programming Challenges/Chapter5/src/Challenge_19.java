import java.util.Scanner;

public class Challenge_19 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //19. Create a program to find the Highest Common Factor(HCF) or Greatest Common Divisor(GCD) of n numbers.(by Euclidean algorithm)
        System.out.print("How Many Numbers GCD or HCF you want: ");
        int sizeNumArr = input.nextInt();
        int[] numArr = new int[sizeNumArr];
        inputArr(numArr);
        gcdOfArray(numArr);
        input.close();
    }

    public static void inputArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the Number No. " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
    }

    public static int gcd(int a, int b){
        int remainder;
        while(b != 0){
            remainder = a%b;
            a = b;
            b = remainder;
        }
        return a;
    }

    public static void gcdOfArray(int[] arr){
        boolean allZero = true;
        for (int num : arr) {
            if (num != 0) {
                allZero = false;
                break;
            }
        }
        if (allZero) {
            System.out.println("GCD is undefined for all zero input.");
            return;
        }
        int gcd = Math.abs(arr[0]);
        for(int i = 1; i < arr.length; i++){
            gcd = gcd(gcd, Math.abs(arr[i]));
        }
        System.out.println("The gcd of the given Numbers is " + gcd + ".");
    }
}
