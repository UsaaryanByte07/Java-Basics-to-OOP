import java.util.Scanner;

public class Challenge_057 {
    public static void main(String[] args) {
        // 57. Take an array of words and concatenate them into a single string usingStringBuilder.
        Scanner input = new Scanner(System.in);
        StringBuilder str = new StringBuilder("");
        String[] strArr = new String[] { "Hello", "Bye", "How are you" };
        for (String string : strArr) {
            str.append(string);
        }
        System.out.println(str);
        input.close();
    }
}
