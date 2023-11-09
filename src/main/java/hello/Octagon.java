package hello;

public class Octagon extends Shape {

    private double side;

    public Octagon() {
        side = 1; // default side
    }

    public void setSide(double newSide) {
        side = newSide;
    }

    public double getSide() {
        return (side);
    }

    @Override
    public double getArea() {
        double octagonArea;

        octagonArea = (side * ((Math.sqrt(side * side * .5)) + side / 2)) * 4;
        return octagonArea;
    }

    @Override
    public double getPerimeter() {
        return (side * 8);

    }
}
