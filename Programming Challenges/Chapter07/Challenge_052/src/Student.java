public class Student {
    // 52. Define a Student class with fields like name and age, and use toString to
    // print student details

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student" + "{name = " + this.name
                + ", age = " + this.age + " }";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Aryan", 18);
        Student s2 = new Student("Rohan", 31);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
    }
}
