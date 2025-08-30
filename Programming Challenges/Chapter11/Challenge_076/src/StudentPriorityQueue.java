import java.util.Comparator;
import java.util.PriorityQueue;

class StudentPriorityQueue {

    public static void main(String[] args) {
        /*
         * 76. Create a PriorityQueue of a custom class Student with attributes
         * name and grade. Use a comparator to order by grade.
         */
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student student1, Student student2) {
                return student1.getGrade() - student2.getGrade();
            }
        });

        queue.offer(new Student("Prashant", 'B'));
        queue.offer(new Student("Shyam", 'C'));
        queue.offer(new Student("Ram", 'A'));
        queue.offer(new Student("Mohan", 'D'));
        queue.offer(new Student("Sanchit", 'A'));

        System.out.printf("Queue is: %s\n", queue); // Prints the Current State of Queue not the Desired Queue we want..
        System.out.printf("Got %s\n", queue.poll()); // But when we ask to get the elements then it gives us the
                                                     // Elements in the Order of the Desired Queue we want..
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
        System.out.printf("Got %s\n", queue.poll());
    }

    private static class Student {
        private final String name;
        private final char grade;

        public Student(String name, char grade) {
            this.name = name;
            this.grade = grade;
        }

        public String getName() {
            return name;
        }

        public char getGrade() {
            return grade;
        }

        @Override
        public String toString() {
            return name + ": " + grade;
        }
    }
}