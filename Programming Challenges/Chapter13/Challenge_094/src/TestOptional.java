import java.util.Optional;

public class TestOptional {
    public static void main(String[] args) {
        /*
         * 94. Write a function that accepts a string and returns an
         * Optional<String>. If the string is empty or null, return an
         * empty Optional, otherwise, return an Optional containing the
         * uppercase version of the string.
         */
        System.out.println(upperCase("Aryan"));
        System.out.println(upperCase(""));
        System.out.println(upperCase("W"));
        System.out.println(upperCase(null));
    }

    private static Optional<String> upperCase(String str){
        if(str == null || str.isEmpty()){
            return Optional.empty();
        } else {
            return Optional.of(str.toUpperCase());
        }
    }
}
