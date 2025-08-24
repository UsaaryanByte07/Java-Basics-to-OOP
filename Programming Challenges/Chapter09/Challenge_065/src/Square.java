public class Square extends Shape{
    final double side;
    Square(double side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return Math.pow(side,2);
    }
}
