public class TestEmployee {
    public static void main(String[] args) {
        /*
         * 61. Define a class Employee with private attributes (like name, age,
         * and salary), public methods to get and set these attributes, and a
         * package-private method to displayEmployeeDetails. Create
         * another class in the same package to test access to the
         * displayEmployeeDetails method.
         */
        Employee emp = new Employee("Aryan", 30, 25000.0);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
