public class Course {
    /*40. Design a Course class.
          •Instance variables: courseName, enrolledStudents.
          •Instance variable: maxCapacityOfStudent, the maximum number of students for a
           course.
          •Static variable: maxCapacityOfCourses, the maximum number of Courses.
          •Instance methods: enrollStudent(String studentName), 
           unenrollStudent(String studentName).
          •Static method: setMaxCapacityOfCourses(int capacity), to set the maximum 
           capacity for courses.
    */

    static int maxCapacityOfCourses = 1000;
    String courseName;
    String[] enrolledStudents;
    int numberOfStudents;
    int maxCapacityOfStudents;

    Course(String courseName, int maxCapacityOfStudents){
        this.courseName = courseName;
        this.maxCapacityOfStudents = maxCapacityOfStudents;
        this.enrolledStudents = new String[maxCapacityOfStudents]; // Initialize array
        numberOfStudents = 0;
    }


    void enrollStudent(String studentName){
        if(numberOfStudents < maxCapacityOfStudents){
            System.out.println("The Student " + studentName + " is Enrolled.");
            this.enrolledStudents[numberOfStudents] = studentName;
            numberOfStudents++;
        }else{
            System.out.println("Maximum Capacity of Students is Reached!!");
        }
    }

    static void setMaxCapacityOfCourses(int maxCapacityOfCourses){
        Course.maxCapacityOfCourses = maxCapacityOfCourses;
    }
    public static void main(String[] args) {
        
        Course javaCourse = new Course("Java Programming", 3);
        javaCourse.enrollStudent("Alice");
        javaCourse.enrollStudent("Bob");
        javaCourse.enrollStudent("Charlie");
        javaCourse.enrollStudent("David"); // Should show capacity reached

        System.out.println("\nEnrolled Students:");
        for (int i = 0; i < javaCourse.numberOfStudents; i++) {
            System.out.println(javaCourse.enrolledStudents[i]);
        }

    // Unenroll demonstration removed as requested
    }
}
