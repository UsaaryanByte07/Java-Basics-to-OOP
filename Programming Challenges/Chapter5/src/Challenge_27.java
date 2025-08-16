import java.util.Scanner;

public class Challenge_27 {
    public static void main(String[] args) {
        /*27. Create a program that print patterns according to number of rows provided by the user:
         
         *
         * *
         * * *
         * * * *
         * * * * * 
         
         * * * * *
         * * * *
         * * *
         * *
         * 
         
                 *
               * *
             * * * 
           * * * *
         * * * * *
        */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number of Rows for Pattern: ");
        int rows = input.nextInt();
        if(rows <= 0){
            System.out.println("Invalid Input!!");
            input.close();
        }else{
            printLeftAlignedRightAngleTriangle(rows);
            printRightAlignedRightAngleTriangle(rows);
            printLeftAlignedInvertedRightAngleTriangle(rows);
            input.close();
        }
    }

    public static void printLeftAlignedRightAngleTriangle(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printRightAlignedRightAngleTriangle(int rows){
        for(int i = 1; i <= rows; i++){
            for(int j = 1; j <= rows - i; j++){
                System.out.print("  ");
            }
            for(int k = 1; k <= i; k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void printLeftAlignedInvertedRightAngleTriangle(int rows){
        for(int i = 0; i < rows; i++){
            for(int j = rows; j > i; j--){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
