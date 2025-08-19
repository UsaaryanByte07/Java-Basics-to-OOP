public class Car {
    static int noOfCarsSold;
    int noOfWheels;
    String color;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;

    static {
        noOfCarsSold = 0;
        System.out.println("I am in Static Block");
    }

    {
        //This is Called Initialization Block
        //It is like a Constructor that is Called Before all other Constructors.
        noOfCarsSold++;
        System.out.println("I am in Init Block");
    }

    //by Default a blank constructor is made by javac
    Car(String color) {
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    Car(){
        this("Black"); //Calling itself and giving black color to the Constructor... Called Constructor Chaining //This should be the 1st line
        currentFuelInLiters = 5; // The Coonstructor Chaining should not create a loop...
    }
    public Car start(){
        if(currentFuelInLiters == 0){
            System.out.println("Car is out of Fuel");
        } else if(currentFuelInLiters < 5){
            System.out.println("Car is in Reserved Mode, Please refuel!!");
        }
        return this;
    }
    public void drive() {
            currentFuelInLiters--;
            System.out.println("Car is driving");
    }

    public void addFuel(float currentFuelInLiters) {
        this.currentFuelInLiters += currentFuelInLiters;
    }

    public float getCurrentFuelLevel() {
        return currentFuelInLiters;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("I am in Finalized.");
    }
}
