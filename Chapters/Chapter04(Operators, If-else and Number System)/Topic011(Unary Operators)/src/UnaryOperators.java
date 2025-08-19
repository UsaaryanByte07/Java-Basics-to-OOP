public class UnaryOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = -x;
        System.out.println(y);
        int z = -y;
        System.out.println(z);

        int p = 5;
        System.out.println(p++); //Post-Increment

        System.out.println(++p); //Pre-Increment

        int q = 10;
        System.out.println(--q); //Pre-Decrement

        System.out.println(q--); //Post-Decrement
    }
}