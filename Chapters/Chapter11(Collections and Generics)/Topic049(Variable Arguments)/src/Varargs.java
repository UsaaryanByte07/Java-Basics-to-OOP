public class Varargs {
    public static void main(String... args /* Same as String[] args */) {
        System.out.println(sum(6, 3));
        System.out.println(sum(6, 3, 72, 27));
        System.out.println(sum(6, 3, 72, 27, 55, 25));
        // System.out.println(sum(new int[]{6, 3, 72, 27, 55, 25})); //this is oalso possible if in the function only varargs is defined as a parameter and no other parameters
    }

    private static int sum(int c, int b, int... a) { // Varargs can be called with no arguments also... hence to set a
                                                     // minimum of two arguments we defined two parameters before
                                                     // varargs... but you cannot define any parameter after varargs
        int sum = c + b;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
}
