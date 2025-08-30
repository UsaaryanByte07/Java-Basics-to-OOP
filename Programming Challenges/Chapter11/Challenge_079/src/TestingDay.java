public class TestingDay {
    public static void main(String[] args) {
        /*
         * 79. Enhance the Day enum by adding an attribute that
         * indicates whether it is a weekday or weekend. Add a
         * method in the enum that returns whether it's a weekday or
         * weekend, and write a program to print out each day along
         * with its type
         */
        for (Day value : Day.values()) {
            System.out.printf("%s : %s\n",value,value.getTypeOfDay());
        }
    }
}
