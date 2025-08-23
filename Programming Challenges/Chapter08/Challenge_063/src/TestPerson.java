public class TestPerson {
    public static void main(String[] args) {
        /*
         * 63. Create a class Person with attributes name and age. Override
         * equals() to compare Person objects based on their attributes.
         * Override hashCode() consistent with the definition of equals()
         */
        Person p1 = new Person("Aryan", 23);
        Person p2 = new Person("Paawan", 22);
        Person p3 = new Person("Salman", 23);
        Person p4 = new Person("Salman", 23);
        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));
        System.out.println(p4.equals(p3));
        System.out.println(p3.equals(p4));
    }
}
