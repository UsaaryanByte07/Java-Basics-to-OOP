import java.util.List;
import java.util.stream.Collectors;

public class TestingIntermediateOperations {
    public static void main(String[] args) {
        List<Integer> nums = List.of(23, 37, 48, 24, 37, 383, 92);

        System.out.println(nums.stream().sorted((x, y) -> x - y).collect(Collectors.toList()));
        System.out.println(nums.stream().sorted((x, y) -> y - x).collect(Collectors.toList()));

       System.out.println(nums.stream().distinct().collect(Collectors.toList()));

       List<String> words = List.of("Aryan","Paawan","radhika","Deepika");
       System.out.println(words.stream().map(String::toUpperCase).collect(Collectors.toList()));
    }
}
