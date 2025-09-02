import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 2, 37, 3, 8);
        int sum1 = 0;
        for (Integer num : nums) {
            sum1 += num;
        }
        System.out.printf("Sum by Normal Method is %d\n", sum1);

        int sum2 = nums.stream().reduce(0, new BinaryOperator<Integer>() {
            @Override
            public Integer apply(Integer num1, Integer num2) {
                return num1 + num2;
            }
        });
        System.out.printf("Sum by Reduce Method with Anonymous class BinaryOperator is %d\n", sum2);

        int sum3 = nums.stream().reduce(0, (a, b) -> a + b);
        System.out.printf("Sum by Reduce Method with Lambda is %d\n", sum3);

        int max = nums.stream()
                .reduce(Integer.MIN_VALUE, (a, b) -> a > b ? a : b);
        System.out.printf("Max by Reduce Method with Lambda is %d\n", max);
        /*
         * 1. Purpose: Used to reduce the elements of a stream to a
         * single value. It takes a binary operator as a parameter
         * and applies it repeatedly, combining the elements of
         * the stream.
         * 2. Versatile: Can be used for summing, finding min or max,
         * and combining elements in a myriad of ways.
         * 3. Optional or Default Value: Without an identity value,
         * reduce returns an Optional. With an identity value, it
         * returns a default value if the stream is empty. (You will Understand the 3rd point further in the chapter..)
         */
    }
}
