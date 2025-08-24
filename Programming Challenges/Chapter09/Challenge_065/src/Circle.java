public class Circle extends Shape{
    final double raduis;
    Circle(double raduis){
        this.raduis = raduis;
    }

    @Override
    public double calculateArea() {
        return Math.PI*Math.pow(raduis,2);
    }
}
