package in.pack;

import in.pack.inheritence.Vehicle;

public class TwoWheeler extends Vehicle{
    public TwoWheeler(){
        setNumberOfTires(2);
        noOfTires = 4;
    }

    public void balance(){
        System.out.println("Balancing on Two Wheels");
    }
}
