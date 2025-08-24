package in.usaryan.polymorphism;

public class TestTransportation {
    /*
     * Run-Time Polymorphism: Overriding is
     * a basis for runtime polymorphism,
     * where the method call is determined
     * by the object's type at runtime.
     */
    public static void main(String[] args) {
        Car c = new Car();

        Plane p = new Plane();

        castTest(c);
        castTest(p);

    }

    private static void castTest(Vehicle veh) {

        veh.start();
    }
}
