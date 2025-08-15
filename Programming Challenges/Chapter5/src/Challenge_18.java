import java.util.Scanner;

public class Challenge_18 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //18. Create a program to find the Least Common Multiple (LCM) of n numbers.(by any method)

        System.out.print("How Many Numbers LCM you want: ");
        int sizeNumArr = input.nextInt();
        int[] numArr = new int[sizeNumArr];
        inputArr(numArr);
        lcm(numArr,greatestNum(numArr));
        input.close();
    }
    
    public static void inputArr(int[] arr){
        for(int i = 0; i < arr.length; i++){
            System.out.print("Enter the Number No. " + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
    }

    public static int greatestNum(int[] arr){
        int greatest = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > greatest){
                greatest = arr[i];
            }
        }
        return greatest;
    }

    public static void lcm(int[] arr, int greatest){
        int lcm = 1;
        int muliplicationOfElementsOtherThenGreatest = 1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] != greatest){
                muliplicationOfElementsOtherThenGreatest *= arr[i];
            }
        }
        for(int i = 1; i <= muliplicationOfElementsOtherThenGreatest; i++){
            boolean isLcm = true;
            for(int j = 0; j < arr.length; j++){
                if((greatest*i)%arr[j] != 0){
                    isLcm = false;
                    break;
                }
            }
            if(isLcm){
                lcm = greatest*i;
                break;
            }
        }
        System.out.println("The LCM of the Numbers given is " + lcm + ".");
    }
}
