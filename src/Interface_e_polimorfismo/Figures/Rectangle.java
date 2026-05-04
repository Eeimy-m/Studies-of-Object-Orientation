package Interface_e_polimorfismo.Figures;

public class Rectangle implements Figure {
    private double widith;
    private double length;

    public Rectangle(double widith, double length) {
        this.widith = widith;
        this.length = length;
    }

    @Override
    public double area() {
        return widith * length;
    }

    public double getWidith() {
        return widith;
    }

    public double getLength() {
        return length;
    }
}
