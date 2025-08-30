import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List list1 = new ArrayList();

        list1.add("Aryan");
        list1.add("John");
        list1.add("Alice");
        list1.add(67);
        list1.add(true);

        list1.remove(3);
        list1.remove("Alice"); // removes the first occurrence of "Alice"

        list1.add(3, "Ayaan");

        for (int i = 0; i < list1.size(); i++) {
            System.out.println(list1.get(i));
        }

        list1.set(2, "Aditi");

        if (list1.contains("Aditi")) {
            System.out.println("List contains Aditi at index " + list1.indexOf("Aditi"));
        }

        list1.clear();

        List<String> list2 = new ArrayList<>(); // <> is called diamond operator... and <String> or <Integer> are called generic types
                                                // generic type are compile time and its just for the programmer's to avoid mistake and the compiler later removes it
        list2.add("Nepal");
        list2.add("Bhutan");
        list2.add("India");
        for (String element : list2) {
            System.out.println(element);
        }
    }
}
