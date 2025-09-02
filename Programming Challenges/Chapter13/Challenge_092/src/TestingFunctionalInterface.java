import java.util.List;

public class TestingFunctionalInterface {
    public static void main(String[] args) {
        /*
         * 92. Create your own functional interface with a single abstract
         * method that accepts an integer and returns a boolean.
         * Implement it using a lambda that checks if the number is
         * prime.
         */
        CheckPrime checkPrime = num -> {
            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(checkPrime.isPrime(47));
    }
}
