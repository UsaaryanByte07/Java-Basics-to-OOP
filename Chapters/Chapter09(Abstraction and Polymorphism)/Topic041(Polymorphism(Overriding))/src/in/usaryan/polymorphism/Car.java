package in.usaryan.polymorphism;

public class Car extends Vehicle{
    Car() {
        super();
    }
    Car(int noOfTires) {
        super(noOfTires);
    }

    public int noOfDoors() {
        return 5;
    }

    @Override //is just a anotation.. compiler has nothing to do with it.. its just written so that the person looking the code can understand that this method is override.. its optional to write this
    public void start() {
        System.out.println(super.getNoOfTires());
        System.out.println("Car is starting");
    }
}
