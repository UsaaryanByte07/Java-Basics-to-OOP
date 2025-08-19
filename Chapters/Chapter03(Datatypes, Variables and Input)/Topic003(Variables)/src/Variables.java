public class Variables {
    public static void main(String[] args) {
        int myNumber = 12; //The Values on the left are called literal
        int yourNumber;
        yourNumber = 89;
        System.out.println(yourNumber);
        yourNumber = 278;
        System.out.println(yourNumber);

        float myFloat = 5.00f; // if you only write 5.00 it will show a warning becoz it thinks that 5.00 is a double and you are assigning it to float but you can remove the warning by putting a f at end.
        double myDouble = 3.99882;
        System.out.println(myFloat);
        System.out.println(myDouble);

        boolean isVeg = true;
        System.out.println(isVeg);

        String wishes = "Good Morning";
        System.out.println(wishes);

        char ch = 'H'; //character literal should be in single qoute
        System.out.println(ch);
    }
}
