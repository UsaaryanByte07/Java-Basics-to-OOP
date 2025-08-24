package in.usaryan.polymorphism;

public class TestTransportation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();
        Plane p = new Plane();

        Vehicle vCar = new Car();
        // Car cVehicle = new Vehicle(); will show error as Vehicle is parent of Child class Car
        // Car cVehicle = (Car) new Vehicle(); this is allowed but as you are type casting Vehicle as Car.. but will give exception in Output

        Object ref1 = new Vehicle();
        Object ref2 = new Car();

        // castTest(v);
        castTest(c);
        // castTest(p); this acceptable 
    }

    private static void castTest(Vehicle v) {
        if(v instanceof Car){
            Car cV = (Car) v;
            cV.start();
            cV.noOfDoors();
            ((Car) v).noOfDoors();
        }
    }
}
