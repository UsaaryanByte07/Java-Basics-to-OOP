import java.util.Scanner;

public class UserInput_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //We are declaring a reference variable input of type Scanner and assigning it a new Scanner object.
        System.out.print("Enter your Name: ");
        String name = input.nextLine();
        System.out.println("Good Morning " + name);
        System.out.print(name + " Enter your Age: ");
        int age = input.nextInt();
        System.out.println(name + " Your age is " + age);
        input.close(); //close the Scanner when done to avoid leak
    }
}
