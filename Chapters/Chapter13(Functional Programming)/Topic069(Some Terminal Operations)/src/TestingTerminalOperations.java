import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TestingTerminalOperations {
    public static void main(String[] args) {
        List<Integer> nums = List.of(1,2,3,7,9);
        Optional<Integer> maxNum = nums.stream().max(Integer::compareTo);
        maxNum.ifPresent(System.out::println);

        Optional<Integer> minNum = nums.stream().min(Integer::compareTo);
        minNum.ifPresent(System.out::println);

        List<Integer> numList = nums.stream().collect(Collectors.toList());
        System.out.println(numList);
    }
}
