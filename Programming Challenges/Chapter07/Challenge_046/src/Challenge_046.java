import java.util.Scanner;

public class Challenge_046 {
    public static void main(String[] args) {
        //46. Create a program using do-while to find password checker until a valid password is entered
        Scanner input = new Scanner(System.in);
        String pass = "Hello008", inPass;
        do {
            System.out.print("Enter the Passowrd: ");
            inPass = input.nextLine();
            if (pass.equals(inPass)) { // In Java, == checks for reference equality, not content equality, for objects
                                       // like Strings. You should use .equals() to compare the contents of two
                                       // strings.
                System.out.println("The Password is Correct!!");
                break;
            } else {
                System.out.println("Password is incorrect!!");
            }
        } while (true);
        input.close();
    }
}
