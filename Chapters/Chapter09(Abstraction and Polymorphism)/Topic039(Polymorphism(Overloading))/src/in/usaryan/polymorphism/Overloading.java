package in.usaryan.polymorphism;

public class Overloading {
    Overloading() {
        System.out.println("Overloading..");
    }

    Overloading(String s) {
        System.out.println(s);
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int add(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    public String add(String str1, String str2) {
        return str1 + str2;
    }

    public static void main(String[] args) {
        // overloading is compile time polymorphism
        Overloading overload = new Overloading();
        int sum = overload.add(12, 3);
        System.out.println(overload.add(12, sum));
        System.out.println(overload.add("Hello ", "Aryan"));
    }
}
