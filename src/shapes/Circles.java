package shapes;
public class Circles {
    private double radius;
    public Circles(double radius){
        this.radius = radius;
    }
    public double getArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double getCircumfrence(){
        return 2 * Math.PI * this.radius;
    }
}
