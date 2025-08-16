import java.util.Scanner;

public class Challenge_23 {
    public static void main(String[] args) {
        //23. Create a program to print the Fibonacci series up to a certain number.(without using recursion)
        Scanner input = new Scanner(System.in);
        System.out.print("Enter till which term you want the Fibonacci Series: ");
        int term = input.nextInt();
        fibonacciSeries(term);
        input.close();
    }

    public static void fibonacciSeries(int term){
        int firstTerm = 0, secondTerm = 1, nextTerm;
        System.out.println("The Fibonacci series till Term No. " + term + " is:");
        for(int i = 0; i < term; i++){
            System.out.print(firstTerm + " ");
            nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}
