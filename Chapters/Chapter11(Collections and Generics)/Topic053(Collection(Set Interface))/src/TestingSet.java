import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        System.out.println(set.add("Nepal"));
        System.out.println(set.add("India"));
        System.out.println(set.add("Bhutan"));
        System.out.println(set.add("Nepal"));

        Utility.printCollection(set);

        System.out.println(set.size());

        System.out.println(set.contains("India"));
        System.out.println(set.remove("India"));
        System.out.println(set.remove("India"));

        System.out.println(set.isEmpty());
    }
}
