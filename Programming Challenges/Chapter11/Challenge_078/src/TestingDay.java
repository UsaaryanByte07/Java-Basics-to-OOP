public class TestingDay {
    public static void main(String[] args) {
        /*
         * 78. Create an enum called Day that represents the days of the
         * week. Write a program that prints out all the days of the
         * week from this enum.
         */
        for (Day value : Day.values()) {
            System.out.println(value);
        }
    }
}
