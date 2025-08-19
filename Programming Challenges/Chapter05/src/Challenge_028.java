import java.util.Scanner;

public class Challenge_028 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //28. Create a program to find number of occurrences of an element in an array.
        int[] numArr = ArrayUtility.input1DArray();
        System.out.print("Enter the Element for which to sreach: ");
        int element = input.nextInt();
        countOccurence(numArr, element);
    }

    public static void countOccurence(int[] numArr, int element){
        int count = 0;
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] == element){
                count++;
            }
        }
        System.out.println("The Element " + element + " Occurs " + count + " times in the Array.");
    }
}
