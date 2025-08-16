public class Challenge_30 {
    public static void main(String[] args) {
        //30. Create a program to check if the given array is sorted.
        int[] numArr = ArrayUtility.input1DArray();
        isSorted(numArr);
    }

    public static boolean isDecreasing(int[] numArr){
        boolean isDec = true;
        for(int i = 0; i < (numArr.length -1); i++){
            if(numArr[i] < numArr[i+1]){
                isDec = false;
                return isDec;
            }
        }
        return isDec;
    }

    public static boolean isIncreasing(int[] numArr){
        boolean isIns = true;
        for(int i = 0; i < (numArr.length -1); i++){
            if(numArr[i] > numArr[i+1]){
                isIns = false;
                return isIns;
            }
        }
        return isIns;
    }

    public static void isSorted(int[] numArr){
        if(isDecreasing(numArr) || isIncreasing(numArr)){
            System.out.println("The Array is sorted.");
        }else{
            System.out.println("The Array is not Sorted.");
        }
    }
}
