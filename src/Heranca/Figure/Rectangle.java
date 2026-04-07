package Heranca.Figure;

public final class Rectangle extends Figure {
    private double widith;
    private double height;

    public Rectangle(double x, double y, double widith, double height) {
        super(x, y);
        this.widith = widith;
        this.height = height;
    }

    @Override
    public double area() {
        if(widith > 0 && height > 0) return widith * height;
        return -1;
    }

    public double getWidith() {
        return widith;
    }

    public double getHeight() {
        return height;
    }
}
