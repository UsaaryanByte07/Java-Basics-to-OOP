public class Employee {
    private final String name;
    private final int salary;

    Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }

    int getSalary() {
        return salary;
    }

    String getName() {
        return name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("{ ").append(name).append(" , ").append(salary).append(" }");
        return sb.toString();
    }
}
