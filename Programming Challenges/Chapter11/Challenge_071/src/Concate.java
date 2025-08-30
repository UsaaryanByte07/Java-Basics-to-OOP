public class Concate {
    public static void main(String[] args) {
        /*
         * 71. Write a method concatenate Strings that takes variable arguments
         * of String type and concatenates them into a single string.
         */
        System.out.println(concateString("Hello ", "Aryan "));
        System.out.println(concateString("Hello ", "Aryan ", "How ", "Are ", "You "));
    }

    private static StringBuilder concateString(String str1, String str2, String... str) {
        StringBuilder total = new StringBuilder();
        total.append(str1).append(str2);
        for (String string : str) {
            total.append(string);
        }
        return total;
    }
}
