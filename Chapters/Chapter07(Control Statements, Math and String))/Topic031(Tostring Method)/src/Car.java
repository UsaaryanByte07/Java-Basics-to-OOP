public class Car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String name;
    String modelNumber;
    String company;

    public Car(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company) {
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    @Override
    public String toString() { // toString method Ideally should tell detials about your Object.
        // Every Object has a default toString method created with Object class
        // But if you don't create a toString method, the default implementation will be
        // used and it will print the class name followed by the hash code.
        return "Car{" + "noOfWheels=" + noOfWheels +
                ", noOfDoors=" + noOfDoors +
                ", maxSpeed=" + maxSpeed +
                ", name='" + name + '\'' +
                ", modelNumber='" + modelNumber + '\'' +
                ", company='" + company + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Car swift = new Car(4, 4, 120,
                "Swift", "SW876", "Maruti");
        System.out.println(swift); // swift also gives the same output as swift.toString()

    }
}