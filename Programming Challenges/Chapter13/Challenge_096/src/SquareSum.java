import java.util.List;

public class SquareSum {
    public static void main(String[] args) {
        /*
         * 96. Create a list of strings representing numbers ("1", "2", ...).
         * Convert each string to an integer, then again calculating
         * squares of each number using the map operation and sum
         * up the resulting integers.
         */
        List<String> numList = List.of("1", "2", "3", "4", "5");

        Integer sum = numList.stream()
                             .map(Integer::parseInt)
                             .map(a -> a*a)
                             .reduce(0, (a,b)-> a+ b);

        System.out.println(sum);
    }
}
