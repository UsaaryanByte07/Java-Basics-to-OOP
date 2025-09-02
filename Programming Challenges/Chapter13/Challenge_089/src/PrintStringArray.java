import java.util.Arrays;
import java.util.List;

public class PrintStringArray {
    public static void main(String[] args) {
        /*
         * 89. Convert an array of strings into a stream. Then, use the
         * stream to print each string to the console.
         */

         List<String> strArr = Arrays.asList("Peacock","Lion","Donkey","Wolf","Hyena","Elephant");
         strArr.stream().forEach(toPrint -> System.out.println(toPrint));
    }
}
