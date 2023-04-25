package shapes;

public class ShapesTest{
    public static void main(String[] args) {
        Measurable myShape;
        Square square = new Square(5);
        myShape = square;
        System.out.println("Area of Square: " + myShape.getArea());
        System.out.println("Perimeter of Square: " + myShape.getPerimeter());
        Rectangle box1 = new Rectangle(4,5);
        System.out.println("Area of Rectangle: " + box1.getArea());
        System.out.println("Perimeter of Rectangle: " + box1.getPerimeter());
        Rectangle box2 = new Rectangle(5, 5);
        System.out.println("Area of Square: " + box2.getArea());
        System.out.println("Perimeter of Square: " + box2.getPerimeter());
    }
}
