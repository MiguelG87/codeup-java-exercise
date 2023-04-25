package shapes;

public class ShapesTest{
    public static void main(String[] args) {
        Square square = new Square(5);
        System.out.println("Area of Square: " + square.getArea());
        System.out.println("Perimeter of Square: " + square.getPerimeter());
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Area of Rectangle: " + box1.getArea());
        System.out.println("Perimeter of Rectangle: " + box1.getPerimeter());
        Rectangle box2 = new Square(5);
        System.out.println("Area of Square: " + box2.getArea());
        System.out.println("Perimeter of Square: " + box2.getPerimeter());
    }
}
