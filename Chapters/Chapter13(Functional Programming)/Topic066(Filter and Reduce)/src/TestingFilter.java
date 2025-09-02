import java.util.List;
import java.util.function.Consumer;

public class TestingFilter {
    public static void main(String[] args) {
        List<String> fruits = List.of("Apple", "Orange", "Cherry", "Pineapple", "Banana", "Mango", "Date");
        System.out.println("Printing Fruits Normally");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Printing Fruits by Streams with creating a anonymous class Consumer");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });

        System.out.println("Printing Fruits by Streams with lambda and Filter");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("e")) /*
                                                       * 1. Purpose: Used to filter elements of a stream based on a
                                                       * given
                                                       * predicate (a condition). Only elements that satisfy the
                                                       * condition are included in the resulting stream.
                                                       * 2. Lazy Operation: It's a lazy operation, meaning it's not
                                                       * executed
                                                       * until a terminal operation (like collect or forEach) is invoked
                                                       * on
                                                       * the stream.
                                                       * 3. Returns a Stream: filter itself returns a new stream with
                                                       * elements that match the predicate.
                                                       */
                .forEach(fruit -> System.out.println(fruit));

    }
}
