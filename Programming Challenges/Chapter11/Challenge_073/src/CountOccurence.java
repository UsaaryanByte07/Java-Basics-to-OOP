import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CountOccurence {
    public static void main(String[] args) {
        /*
         * 73. Use the Collections class to count the frequency of a particular
         * element in an ArrayList
         */
        List<Integer> numList = Arrays.asList(12,75,90,77,12,93,336,34,12,83);
        System.out.println(Collections.frequency(numList,12));
    }
}
