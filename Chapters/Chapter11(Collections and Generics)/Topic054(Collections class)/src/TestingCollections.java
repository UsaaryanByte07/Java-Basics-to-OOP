import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestingCollections {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(89);
        numList.add(2);
        numList.add(28);
        Utility.printCollection(numList);
        
        Collections.sort(numList);
        
        Utility.printCollection(numList);
        
        Collections.reverse(numList);
        
        Utility.printCollection(numList);

        List<Integer> unmodifiable = Collections.unmodifiableList(new ArrayList<>(numList)); //Now this new list cannot be modified(elements cannot be added/removed)
        
    }
}
