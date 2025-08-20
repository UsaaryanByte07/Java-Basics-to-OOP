import java.util.Scanner;

public class Challenge_043 {
    public static void main(String[] args) {
        // 43. Create a program to Based on a student's score, categorize as "High",
        // "Moderate", or "Low" using the ternary operator (e.g., High for scores > 80,
        // Moderate for 50-80, Low for < 50).
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Marks: ");
        int marks = input.nextInt();
        String remark = (marks > 100 || marks < 0) ? "Invalid marks"
                : (marks > 80 && marks <= 100) ? "High" : (marks <= 80 && marks >= 50) ? "Moderate" : "Low";
        System.out.println(remark != "Invalid marks" ? "You have got " + remark + " marks." : remark);
        input.close();
    }
}
