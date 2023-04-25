package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }
}
//    public double side;
//    public Square(double side){
//        super(side, side);
//    }
//    public double getArea() {
//        return side * 2;
//    }
//    public double getPerimeter() {
//        return 4 * side;
//    }

