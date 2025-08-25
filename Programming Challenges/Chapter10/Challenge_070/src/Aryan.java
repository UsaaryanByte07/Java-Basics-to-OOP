import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Aryan {
    public static void main(String[] args) {
        /*
         * 70. File Not Found Exception Handling
         * Write a program to read a filename from the user and display its
         * content. The program should handle the situation where the file
         * does not exist.
         * Key Points:
         * •Use Scanner to read the filename from the user.
         * •Use FileReader to read the file content.
         * •Implement a try-catch block to handle FileNotFoundException.
         * •Display a message informing the user if the file is not found.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the file name(without .txt): ");
        String fileName = input.nextLine() + ".txt";
        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            while (true) {
                read = reader.read();
                if (read == -1) {
                    break;
                }
                System.out.print((char) read);
            }
        } catch (IOException e) {
            if (e instanceof FileNotFoundException) {
                System.out.println("File not Found!!");
            } else {
                System.out.println("Exception Occurred!!");
            }
        }
        input.close();
    }
}
