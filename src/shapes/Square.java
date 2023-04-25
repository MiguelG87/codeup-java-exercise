package shapes;

public class Square extends Rectangle {
    public double side;
    public Square(double side){
        super(side, side);
    }
    public double getArea() {
        return side * 2;
    }
    public double getPerimeter() {
        return 4 * side;
    }
}
