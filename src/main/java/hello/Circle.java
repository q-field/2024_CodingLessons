package hello;

public class Circle extends Shape {

    private static final double PI = 3.14;
    private double              radius;

    public Circle(double radius) {
        this.radius = radius;

    }

    public Circle() {
        this.radius = 1; // default radius
    }

    public void setRadius(double newRadius) {
        this.radius = newRadius;
    }

    @Override
    public double getArea() {
        double circleArea;

        circleArea = PI * radius * radius;
        return circleArea;
    }

    public double getRadius() {
        return (radius);
    }

    @Override
    double getPerimeter() {
        return (radius * 2 * PI);
    }
}
