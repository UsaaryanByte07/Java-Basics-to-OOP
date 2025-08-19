import java.util.Scanner;

public class Challenge_024 {
    public static void main(String[] args) {
        //23. Create a program to print the Fibonacci series up to a certain number.(by using recursion)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter till which term you want the Fibonacci Series: ");
        int term = input.nextInt();
        System.out.println("The Fibonacci series till Term No. " + term + " is:");
        for(int i = 1; i <= term; i++){
            System.out.print(fibonacciSeries(i) + " ");
        }
        input.close();
    }

    public static int fibonacciSeries(int term){
        if(term == 1){
            return 0;
        }
        if(term == 2){
            return 1;
        }
        return fibonacciSeries(term-1) + fibonacciSeries(term-2);
    }
}
