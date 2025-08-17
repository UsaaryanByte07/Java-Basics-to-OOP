import java.sql.Driver;

public class Driver_24 {

    static int minAgeForDriving = 18;

    String name;
    int age;
    String dateOfLicense;

    public boolean isAllowedToDrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {
        // Car_23 myCar = new Car_23();
        // myCar.addFuel(6);
        // myCar.drive();
        // myCar.drive();
        // myCar.drive();
        // myCar.addFuel(3);
        // myCar.drive();
        // System.out.println(myCar.getCurrentFuelLevel());

        Car_23 swift = new Car_23("Yellow");
        Car_23 thar = new Car_23();
        thar = null;
        // swift.addFuel(6);
        swift.start().drive();
        System.out.println(swift.color);

        // Driver_24 myDriver = new Driver_24();
        // myDriver.dateOfLicense = "1/Jan/2024";
        // System.out.println(minAgeForDriving);
        // System.out.println(myDriver.minAgeForDriving); //This can be done but not preffered as minAgeForDriving is a static instance so it can directly be accessed w/o specifing object
    }
}
