import java.util.List;
import java.util.Optional;

public class TestingOptional {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1, 3, 7, 8, 9, 4);

        Optional<Integer> sum = nums.stream()
                .reduce(Integer::sum);

        if (sum.isPresent()) {
            System.out.println(sum.get());
        } else {
            System.out.println("List is Empty!!");
        }

        /*
         * 1. Creating Optional Objects: Optional.empty(),
         * Optional.of(), Optional.ofNullable()
         * 2. Checking Value Presence: isPresent() and ifPresent()
         * 3. Default Values: orElse() and orElseGet()
         * 4. Value Transformation: map()
         * 5. Throwing Exception: orElseThrow()
         */

    }
}
