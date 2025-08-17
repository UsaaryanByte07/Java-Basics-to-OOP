public class TwoDimensionalArray_22 {
    public static void main(String[] args) {
        int[][] myArr = new int[2][3];
        myArr[0][0] = 9;

        int[][] arr = {{1,2,3}, {4,5}, {7,8,9}}; //Called a heterogenous 2D Array
        System.out.println(arr[0].length);

        // Traversal
        int i = 0;
        while (i < arr.length) {
            int j = 0;
            while (j < arr[i].length) {
                System.out.print(arr[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
