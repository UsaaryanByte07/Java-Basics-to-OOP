import java.util.Scanner;

public class ArrayUtility {

    // Method to take input in a 1D array and return it
    public static int[] input1DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the 1D array: ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            arr[i] = input.nextInt();
        }
        return arr;
    }

    // Method to print a 1D array
    public static void print1DArray(int[] arr) {
        System.out.print("1D Array: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    // Method to take input in a 2D array and return it
    public static int[][] input2DArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for the 2D array: ");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns for the 2D array: ");
        int cols = input.nextInt();
        int[][] arr = new int[rows][cols];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                arr[i][j] = input.nextInt();
            }
        }
        return arr;
    }

    // Method to print a 2D array
    public static void print2DArray(int[][] arr) {
        System.out.println("2D Array:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to count occurrences of an element in a 1D array
    public static int countOccurence(int[] numArr, int element){
        int count = 0;
        for(int i = 0; i < numArr.length; i++){
            if(numArr[i] == element){
                count++;
            }
        }
        return count;
    }

    // Method to reverse the array in place using XOR swap
    public static void reverseArrayInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] ^ arr[arr.length - i - 1];
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
        }
    }

    // Method to return a new reversed array (does not modify original)
    public static int[] reversedArray(int[] arr) {
        int[] newArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[arr.length - i - 1];
        }
        return newArr;
    }
}
