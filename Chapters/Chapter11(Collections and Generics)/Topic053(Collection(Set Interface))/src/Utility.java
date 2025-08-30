import java.util.Collection;

public class Utility {
    static void printCollection(Collection coll) {
        for (Object obj : coll) {
            System.out.print(obj.toString() + " ");
        }
        System.out.println();
    }

    //Can also write the above like this
    // static <E> void printCollection(Collection<E> coll) {
    //     for (E obj : coll) {
    //         System.out.printf("%s ", obj);
    //     }
    //     System.out.println();
    // }
}
