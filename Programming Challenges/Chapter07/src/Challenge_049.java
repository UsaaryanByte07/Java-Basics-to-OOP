import java.util.Scanner;

public class Challenge_049 {
    public static void main(String[] args) {
        // 49. Create a program using for-each to the occurrences of a specific element
        // in an array.
        Scanner input = new Scanner(System.in);
        int[] arr = new int[] { 10, 74, 33, 89, 22, 90, 22, 21, 0, 54 };
        System.out.print("Enter the Elemant to search for: ");
        int searchElement = input.nextInt();
        searchElement(arr, searchElement);
        input.close();
    }

    public static void searchElement(int[] arr, int searchElement) {
        int count = 0;
        for (int element : arr) {
            if (searchElement == element) {
                count++;
            }
        }
        System.out.println("The Element " + searchElement + " Appears " + count + " times.");
    }
}
