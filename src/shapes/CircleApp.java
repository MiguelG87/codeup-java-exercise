package shapes;
import util.Input;
public class CircleApp {
    public static void main(String[] args){
        Input input1 = new Input();
        System.out.println("Please enter the radius of the circle: ");
        Circles circles1 = new Circles(input1.getDouble());
        System.out.format("Circle area: %f%nCircle Circumfrence: %f%n",circles1.getArea(), circles1.getCircumfrence());
    }
}
