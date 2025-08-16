import java.util.Scanner;

public class Challenge_31 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //31. Create a program to return a new array deleting a specific element.
        int[] numArr = ArrayUtility.input1DArray();
        System.out.print("Enter the Element to Delete: ");
        int delElement = input.nextInt();
        int[] newArr = deleteElementFromArray(numArr, delElement);
        ArrayUtility.print1DArray(newArr);
    }

    public static int[] deleteElementFromArray(int[] numArr, int delElement){
        int size = numArr.length - ArrayUtility.countOccurence(numArr, delElement);
        int[] newArr = new int[size];
        int i =0, j = 0;
        while(i < numArr.length && j != newArr.length){
            if(numArr[i] != delElement){
                newArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;
    }
}
