import java.util.Scanner;

public class Challenge_35 {
    public static void main(String[] args) {
        //35. Create a program to search an element in a 2D array.
        int[][] arr = ArrayUtility.input2DArray();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the element to search: ");
        int searchElement = input.nextInt();
        searchElementIn2DArray(arr, searchElement);
    }

    // Function to search for an element in a 2D array and display its positions
    public static void searchElementIn2DArray(int[][] arr, int searchElement) {
        boolean found = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == searchElement) {
                    System.out.println("Element " + searchElement + " found at position [" + i + "][" + j + "].");
                    found = true;
                }
            }
        }
        if (!found) {
            System.out.println("Element " + searchElement + " not found in the array.");
        }
    }
}
