public class TemperatureException extends Exception{
    private double degrees;

    TemperatureException(double degrees){
        this.degrees = degrees;
    }

    @Override
    public String getMessage(){
        return "The Temperature (" + degrees + "C) isn't in normal range";
    }

    public double getDegrees(){
        return degrees;
    }
}
