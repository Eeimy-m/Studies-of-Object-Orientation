package Heranca.Figure;

public final class Rectangle extends Figure {
    private final double width;
    private final double height;

    public Rectangle(double x, double y, double widith, double height) {
        super(x, y);
        this.width = widith;
        this.height = height;
    }

    @Override
    public String toString() {
        return String.format("Rectangle of widith %.2f and height %.2f in %s with area of %.2f", width, height, super.toString(), area());
    }

//    @Override
//    public boolean equals(Object a) {
//            if(a == null || getClass() != a.getClass()) return false;
//
//            Rectangle rectangle = (Rectangle) a;
//            return Double.compare(height, )
//    }

    @Override
    public double area() {
        if(width > 0 && height > 0) return width * height;
        return -1;
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }
}
