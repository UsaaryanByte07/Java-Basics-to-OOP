import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 1st Number: ");
        int num1 = input.nextInt();
        System.out.print("Enter the 2nd Number: ");
        int num2 = input.nextInt();

        try{
            double[] arr = new double[10];
            int result = num1/num2;
            System.out.println("The Result of division is " + result + ".");
            arr[10] = result;
        }catch(ArithmeticException | ArrayIndexOutOfBoundsException exception){
            System.out.printf("%s, Invalid Input!!",exception.getMessage());
        } catch(Exception e){
            System.out.println("Exception!!");
        }catch(Throwable ex){
            System.out.println("General Exception!!");
        }
        input.close();
    }
}
