package Heranca.Figure;

public final class Circle extends Figure{
    private double radius;

    public Circle(double x, double y, double radius) {
        super(x, y);
        this.radius = radius;
    }

    @Override
    public String toString() {
        return String.format("Circle of radius %.2f in %s with area of %.2f", radius, super.toString(), area());
    }

    @Override
    public double area() {
        if(radius > 0) {
            return Math.PI * Math.pow(radius, 2);
        }

        return 0;
    }

    public double getRadius() {
        return radius;
    }
}
