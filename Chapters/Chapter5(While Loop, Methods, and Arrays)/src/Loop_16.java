import java.util.Scanner;

public class Loop_16 {
    public static void main(String[] args) {
        for(int i = 0; i <= 100; i++){
            System.out.println(i);
        }

        int num = 1; // initialization
        while (num <= 10) { // condition
            System.out.println(num); // actual work
            num = num + 1; // updating the condition
        }

        int count = 500;
        while (count >= 200) {
            System.out.println(count);
            count -= 1;
        }

        Scanner input = new Scanner(System.in);
        int i = 0;
        while (i < 5) {
            int inp = input.nextInt();
            System.out.println("Number is: " + inp);
            i++;
        }
        
        int number;
        do{
            System.out.print("Enter 0 to Exit the Loop: ");
            number = input.nextInt();
        }while(number != 0);
        //First the block of code in the do gets excuted and then while checks the condition.. hence loop gets executed at least once.
        input.close();
    }
}
