import java.util.Scanner;

public class Challenge_038 {
    static Scanner input = new Scanner(System.in); 
    public static void main(String[] args) {
        //38. Write a Program to Sort the Array in Descending or Ascending order.
        int[] arr = ArrayUtility.input1DArray();
        System.out.print("To Arrange the Array:\nIn Ascending Order Enter 1\nIn Descending Order Enter 2\nEnter Your Choice: ");
        int choice = input.nextInt();
        if(choice == 1){
            sortAscending(arr);
            ArrayUtility.print1DArray(arr);
        }else if(choice == 2){
            sortDescending(arr);
            ArrayUtility.print1DArray(arr);
        }else{
            System.out.println("Invalid Choice!!");
        }
    }

    public static void sortAscending(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(j > i && arr[j] < arr[i]){
                    arr[i] = arr[j]^arr[i];
                    arr[j] = arr[j]^arr[i];
                    arr[i] = arr[j]^arr[i];
                }
            }
        }
    }

    public static void sortDescending(int[] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr.length; j++){
                if(j > i && arr[j] > arr[i]){
                    arr[i] = arr[j]^arr[i];
                    arr[j] = arr[j]^arr[i];
                    arr[i] = arr[j]^arr[i];
                }
            }
        }
    }
}
