import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Comparartor {
    public static void main(String[] args) {
        /*
         * 72. Write a program that sorts a list of String objects in descending
         * order using a custom Comparator.
         */
        List<String> stringList = Arrays.asList("Ant","Zebra","Lion","Bear");
        System.out.println(stringList);
        sortInDescending(stringList);
        System.out.println(stringList);
    }

    private static void sortInDescending(List<String> sList){
        //One way is this without custom Comparator
        // Collections.sort(sList);
        // Collections.reverse(sList);
        Collections.sort(sList, new java.util.Comparator<String>() {
            @Override
            public int compare(String s, String T1){
                //This is not a legitimate Sorting as we are only Comparing the first Characters of String..
                if(s.equals(T1)){
                    return 0;
                } else if(s.charAt(0) < T1.charAt(0)){
                    return 1;
                } else {
                    return -1;
                }
            }
        });
    }
}
