package in.gettersetter;

public class Car {
    private String color;
    private String model;
    private double fuelLevel;
    private long costOfPurchase;

    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    public void setFuelLevel(double fuelLevel) {
        this.fuelLevel = fuelLevel;
    }

    public String getColor(){
        return this.color;
    }

    public String getModel(){
        return this.model;
    }

    public void setColor(String color) {
        if (color.equals("Yellow")) {
            System.out.println("Pagal hai kya");
        } else {
            this.color = color;
        }
    }
}