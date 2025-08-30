import java.util.Collection;

public class Utility {

    static <E> void printCollection(Collection<E> coll) {
        for (E obj : coll) {
            System.out.printf("%s ", obj);
        }
        System.out.println();
    }
}
