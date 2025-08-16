public class Challenge_33 {
    public static void main(String[] args) {
        //33. Create a program to check is the array is palindrome or not.
        int[] arr = ArrayUtility.input1DArray();
        checkPalindromeArray(arr);
    }

    public static void checkPalindromeArray(int[] arr) {
        int[] reverseArr = ArrayUtility.reversedArray(arr);
        boolean isPalindrome = true;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != reverseArr[i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome) {
            System.out.println("The entered array is a palindrome.");
        } else {
            System.out.println("The entered array is not a palindrome.");
        }
    }
}
