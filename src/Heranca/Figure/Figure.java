package Heranca.Figure;

public sealed class Figure permits Rectangle, Circle, Triangle {
    private double x;
    private double y;

    public Figure(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Figure() {}

    @Override
    public String toString() {
        return String.format("(%.2f, %.2f)", x, y);
    }

    public double area() {
        if(x > 0 && y > 0) return x * y;
        return -1;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
