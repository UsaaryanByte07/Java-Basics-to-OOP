public class Challenge_034 {
    public static void main(String[] args) {
        System.out.println("Welcome to Merging Sorted Arrays\n");
        int[] arr1 = ArrayUtility.input1DArray();
        int[] arr2 = ArrayUtility.input1DArray();
        int[] mergedArr = merge(arr1, arr2);
        System.out.println("Your merged array is:");
        ArrayUtility.print1DArray(mergedArr);
    }

    public static int[] merge(int[] arr1, int[] arr2) {
        int newSize = arr1.length + arr2.length;
        int[] newArr = new int[newSize];
        int i = 0, j = 0, k = 0;
        // Merge while both arrays have elements
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                newArr[k++] = arr1[i++];
            } else {
                newArr[k++] = arr2[j++];
            }
        }
        // Copy remaining elements from arr1
        while (i < arr1.length) {
            newArr[k++] = arr1[i++];
        }
        // Copy remaining elements from arr2
        while (j < arr2.length) {
            newArr[k++] = arr2[j++];
        }
        return newArr;
    }
}
