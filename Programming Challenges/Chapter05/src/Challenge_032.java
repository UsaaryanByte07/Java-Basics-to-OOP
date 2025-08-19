public class Challenge_032 {
    public static void main(String[] args) {
        //32. Create a program to reverse an array.
        int[] arr = ArrayUtility.input1DArray();
        System.out.print("Original Array: ");
        ArrayUtility.print1DArray(arr);
        reverseArrayInPlace(arr);
        System.out.print("Reversed Array: ");
        ArrayUtility.print1DArray(arr);
    }

    // Method to reverse the array in place using XOR swap
    public static void reverseArrayInPlace(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            // XOR swap without using a temporary variable
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
            arr[arr.length - i - 1] = arr[i] ^ arr[arr.length - i - 1];
            arr[i] = arr[i] ^ arr[arr.length - i - 1];
        }
    }
}
