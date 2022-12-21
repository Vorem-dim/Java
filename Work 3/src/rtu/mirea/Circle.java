package rtu.mirea;

public class Circle extends Shape{
    protected double radius;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(String colour, boolean filled, double radius) {
        super(colour, filled);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return 3.14 * radius * radius;
    }
    public double getPerimeter() {
        return 2 * 3.14 * radius;
    }
    public String toString() {
        return "Radius of the circle is " + radius;
    }
}
