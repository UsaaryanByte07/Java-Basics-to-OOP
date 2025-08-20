import java.util.Scanner;

public class Challenge_048 {
    public static void main(String[] args) {
        // 48. Create a program using for-each to find the maximum value in an integer
        // array.
        int[] arr = new int[] { 10, 74, 33, 89, 22, 90, 22, 21, 0, 54 };
        maxElement(arr);
    }

    public static void maxElement(int[] arr) {
        int maxElement = arr[0];
        for (int element : arr) {
            if (maxElement < element) {
                maxElement = element;
            }
        }
        System.out.println("The Max Element is " + maxElement);
    }
}
