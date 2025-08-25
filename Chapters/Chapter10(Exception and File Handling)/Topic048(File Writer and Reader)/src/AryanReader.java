import java.io.FileReader;
import java.io.IOException;

public class AryanReader {
    public static void main(String[] args) {
        String fileName = "java-course.txt";

        try (FileReader reader = new FileReader(fileName)) {
            int read = 0;
            while (true){
                read = reader.read();
                if(read == -1){
                    break;
                }
                System.out.print((char)read);
            }
        } catch (IOException e) {
            System.out.printf("Exception occured: %s", e.getMessage());
        }
    }
}
