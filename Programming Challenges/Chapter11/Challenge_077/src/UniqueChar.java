import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        /*
         * 77. Write a program that takes a string and returns the number of
         * unique characters using a Set.
         */
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the String: "); 
        String str = input.nextLine();
        Set<Character> strSet = new HashSet<>();
        for(char ch : str.toCharArray()){
            strSet.add(ch);
        }
        System.out.printf("Number of Unique Characters in the String %s are %d\n",str,strSet.size());
        input.close();
    }
}
