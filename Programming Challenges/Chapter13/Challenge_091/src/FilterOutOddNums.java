import java.util.List;

public class FilterOutOddNums {
    public static void main(String[] args) {
        /*
         * 91. Given a list of integers, use stream operations to filter odd
         * numbers and print them.
         */
        List<Integer> nums = List.of(1,2,3,4,5,6,7,8,9);
        nums.stream().filter(num -> num%2!=0).forEach(num -> System.out.println(num));
    }
}
