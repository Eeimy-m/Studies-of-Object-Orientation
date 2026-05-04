package Interface_e_polimorfismo.Figures;

public class Circle implements Figure {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return Math.PI*Math.pow(radius, 2);
    }

    public double getRadius() {
        return radius;
    }
}
