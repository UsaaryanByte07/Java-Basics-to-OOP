import java.util.Scanner;

public class Challenge_017 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //17. Create a program to find the Greatest Common Divisor(GCD) or Highest Common Factor(HCF) of n numbers.(using any method)
        System.out.print("How Many Numbers GCD or HCF you want: ");
        int sizeNumArr = input.nextInt();
        int[] numArr = new int[sizeNumArr];
        inputArr(numArr);
        gcd(numArr,smallestNum(numArr));
        input.close();
    }
    
    public static void inputArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the Number No. " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
    }

    public static int smallestNum(int[] arr){
        int smallest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < smallest){
                smallest = arr[i];
            }
        }
        return smallest;
    }

    public static void gcd(int[] arr, int smallest){
        int gcd = 0;
        for(int i = 1; i <= smallest; i++){
            boolean isDivisible = true;
            for(int j =0; j < arr.length; j++){
                if(arr[j]%i != 0){
                    isDivisible = false;
                    break;
                }
            }
            if(isDivisible){
                gcd = i;
            }
        }
        System.out.println("The GCD or HCF of Given Numbers is " + gcd + ".");
    }
}
