import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Country {
    public static void main(String[] args) {
        /*
         * 80. Create a Map where the keys are country names (as String)
         * and the values are their capitals (also String). Populate the
         * map with at least five countries and their capitals. Write a
         * program that prompts the user to enter a country name
         * and then displays the corresponding capital, if it exists in
         * the map.
         */

         Map<String, String> country = new HashMap<>();
         country.put("India", "Delhi");
         country.put("America", "Washington DC");
         country.put("Russia", "Moscow");
         country.put("Thailand", "Bangkok");
         country.put("Bangladesh", "Dhaka");

         Scanner input = new Scanner(System.in);
         System.out.print("Enter the Country Name: ");
         String countryName = input.nextLine();
         if(!country.containsKey(countryName)){
            System.out.printf("No data for the Country %s!!\n",countryName);
         }else{
            System.out.printf("The Capital of Country %s is %s\n",countryName,country.get(countryName));
         }
         input.close();
    }
}
