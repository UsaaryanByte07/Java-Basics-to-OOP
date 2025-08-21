package in.pack.inheritence;

public class Vehicle {
    protected int noOfTires;

    public void setNumberOfTires(int noOfTires){
        this.noOfTires = noOfTires;
    }

    @Override
    public String toString() {
        return "Vehicle no of tires: " + noOfTires;
    }

    public void commute(){
        System.out.printf("The no. of tires in the Vehicle is %d.\n",this.noOfTires);
    }
}
