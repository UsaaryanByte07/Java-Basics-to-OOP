public class Challenge_37 {
    public static void main(String[] args) {
        //37. Create a program to do sum and average of all elements in a 2-D array.
        int[][] arr = ArrayUtility.input2DArray();
        ArrayUtility.print2DArray(arr);
        sumAndAverageOf2DArray(arr);
    }

    public static void sumAndAverageOf2DArray(int[][] arr){
        int sum = 0;
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[i].length; j++){
                sum += arr[i][j];
            }
        }
        float avg = (float)sum/(float)ArrayUtility.totalLength2DArray(arr);

        System.out.println("The Sum and the Average of the Elements of 2D Array is " + sum + " and " + avg + " respectively.");
    }
}
