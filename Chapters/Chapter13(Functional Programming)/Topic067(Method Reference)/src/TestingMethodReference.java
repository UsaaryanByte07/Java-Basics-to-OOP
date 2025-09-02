import java.util.List;

public class TestingMethodReference {
    public static void main(String[] args) {
        List<Integer> nums = List.of(22, 45, 73, 4, 48, 57);

        nums.stream()
                .filter(num -> num % 2 == 1)
                .forEach(System.out::println);

        nums.stream()
                .filter(num -> num % 2 == 1)
                .forEach(num -> System.out.println(num));

        Integer sum1 = nums.stream()
                           .reduce(0,(a, b) -> a + b);

        System.out.println("The Sum by Lambda is " + sum1);
        
        Integer sum2 = nums.stream()
                           .reduce(0, Integer::sum);
        
        System.out.println("The Sum by Method Reference is " + sum2);
        
                      
        /*
         * 1. Purpose Syntax & Usage: A method reference is described using ::
         * (double colon) syntax. For example, System.out::println refers to the
         * println method of the System.out object.
         * 2.Functional Interfaces: They are used with functional interfaces.
         * 3.Benefit: They make your code more readable and concise
         * 4.Limitation: They can only be used for methods that fit the
         * parameters and return type.
         */
    }
}
