import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        /*
         * 93. Write two versions of a program that calculates the factorial
         * of a number: one using structural (procedural) programming,
         * and the other using functional programming
         */
        int num = 6;
        System.out.println("Factorial of 6 by Structural Programming " + factorial(num));
        
        System.out.println(
                "Factorial of 6 by Functional Programming " + IntStream.rangeClosed(2, num).reduce(1, (a, b) -> a * b));
    }

    private static int factorial(int num){
        if(num ==1 || num == 0){
            return 1;
        }
        return factorial(num-1)*num;
    }
}
