import java.util.List;

public class FilterStringsAndConcate {
    public static void main(String[] args) {
        /*
         * 90. Given a list of strings, use stream operations to filter out
         * strings that have length of 10 or more and then
         * concatenate the remaining strings.
         */

         List<String> strList= List.of("JHjwksbdsfrd","ugudewhewdg","eewhwqi","juhedwuhweg","hsgss","jddv");

         String finalStr = strList.stream().filter(str -> str.length() < 10 ).reduce("",(str1,str2) -> str1 + str2);

         System.out.println(finalStr);

    }
}
