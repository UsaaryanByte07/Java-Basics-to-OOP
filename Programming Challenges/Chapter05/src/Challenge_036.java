public class Challenge_036 {
    public static void main(String[] args) {
        //36. Create a program to do the sum of the diagonal elements of the 2D array.
        int[][] arr = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);
        printSumOfDiagonals(arr);
    }

    // Function to calculate and print the sum of diagonal elements (main diagonal only)
    public static void printSumOfDiagonals(int[][] arr) {
        int sum = 0;
        int n = Math.min(arr.length, arr[0].length); // For non-square matrices
        for (int i = 0; i < n; i++) {
            sum += arr[i][i];
        }
        System.out.println("The sum of the diagonal elements is: " + sum);
    }
}
