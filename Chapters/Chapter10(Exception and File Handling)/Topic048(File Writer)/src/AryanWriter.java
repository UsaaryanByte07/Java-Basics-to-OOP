import java.io.FileWriter;
import java.io.IOException;

public class AryanWriter {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileWriter writer = new FileWriter(fileName)/*
                                                          * Called try with resource(With try-with-resources, you
                                                          * declare one or more resources (objects that implement the
                                                          * AutoCloseable interface) inside the parentheses of the try
                                                          * statement. These resources are automatically closed at the
                                                          * end of the try block, even if an exception occurs.)
                                                          */) {
            writer.write("This is the best Java course.\n");
            for (int i = 0; i < 10000; i++) {
                writer.write('*');
            }

            writer.flush();
            System.out.println("File Written Successfully");
        } catch (IOException exception) {
            System.out.printf("Exception occurred %s\n",
                    exception.getMessage());
        }
    }
}