import java.util.Arrays;
import java.util.List;

public class Swap {
    public static void main(String[] args) {
        /*
         * 74. Write a method that swaps two elements in an ArrayList, given
         * their indices.
         */
        List<Integer> numList = Arrays.asList(12, 82, 87, 26, 53, 46);
        System.out.println(numList);
        swap(numList, 12, 46);
        System.out.println(numList);
    }

    private static void swap(List<Integer> nList, Integer e1, Integer e2) {
        int idx1 = nList.indexOf(e1);
        int idx2 = nList.indexOf(e2);
        if (idx1 == -1 || idx2 == -1) {
            System.out.println("One or both elements not found.");
            return;
        }
        Integer temp = nList.get(idx1);
        nList.set(idx1, nList.get(nList.indexOf(e2)));
        nList.set(idx2, temp);
    }
}
