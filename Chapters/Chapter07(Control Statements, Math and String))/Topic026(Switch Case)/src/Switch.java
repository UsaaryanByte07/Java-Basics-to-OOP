import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter the Date of the Week(1-7): ");
        int date = input.nextInt();
        newSwitch(date);
        oldSwitch(date);
        input.close();
    }

    public static void newSwitch(int date) {
        String day = switch (date) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6, 7 -> "Holiday";
            default -> "Invalid Date";
        };

        System.out.println("Today is " + day + "!!");
    }

    public static void oldSwitch(int date) {
        switch (date) {
            case 1:
                System.out.println("Today is Monday!!");
                break;
            case 2:
                System.out.println("Today is Tuesday!!");
                break;
            case 3:
                System.out.println("Today is Wednesday!!");
                break;
            case 4:
                System.out.println("Today is Thursday!!");
                break;
            case 5:
                System.out.println("Today is Friday!!");
                break;
            case 6:
            case 7:
                System.out.println("Today is Holiday!!");
                break;
            default:
                System.out.println("Invalid Input!!");
        }
    }
}
