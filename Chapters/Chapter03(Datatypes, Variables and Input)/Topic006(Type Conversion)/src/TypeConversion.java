public class TypeConversion {
    public static void main(String[] args) {
        //Called as Implicit Type Conversion
        long num1 = 3812;
        float num2 = 332;

        //Called as Explicit Type Conversion or Type Casting
        int num3 = (int) 3.33;
        float num4 = (float) 3.33; //Becoz by default Java considers 3.33 as Double not float.
        //Data lose may be possible while Type Casting
        System.out.println(num3);
    }
}
