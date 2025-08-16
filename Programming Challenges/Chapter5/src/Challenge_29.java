public class Challenge_29 {
    public static void main(String[] args) {
        //29. Create a program to find the maximum and minimum element in an array.
        int[] numArr = ArrayUtility.input1DArray();
        maxElement(numArr);
        minElement(numArr);
    }

    public static void maxElement(int[] numArr){
        int max = numArr[0];
        for(int i = 1; i < numArr.length; i++){
            if(max < numArr[i]){
                max = numArr[i];
            }
        }
        System.out.println("The Maximum Element in the Array is " + max + ".");
    }

    public static void minElement(int[] numArr){
        int min = numArr[0];
        for(int i = 1; i < numArr.length; i++){
            if(min > numArr[i]){
                min = numArr[i];
            }
        }
        System.out.println("The Minimum Element in the Array is " + min + ".");
    }
}
