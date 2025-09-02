import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class SortEmployee {
    public static void main(String[] args) {
        /*
         * 95. Create a list of employees with name and salary fields.
         * Write a comparator that sorts the employees by salary.
         * Then, use this comparator to sort your list using the sort
         * stream operation.
         */
        List<Employee> empList = List.of(new Employee("Aryan", 30000),
                new Employee("Paawan", 20000),
                new Employee("Salman", 40000),
                new Employee("Radhika", 24000));
        List<Employee> ascSortedRmpList = empList.stream().sorted((e1, e2) -> e1.getSalary() - e2.getSalary())
                .collect(Collectors.toList());

        System.out.println(ascSortedRmpList);

        List<Employee> descSortedRmpList = empList.stream().sorted((e1, e2) -> e2.getSalary() - e1.getSalary())
                .collect(Collectors.toList());

        System.out.println(descSortedRmpList);
    }
}
