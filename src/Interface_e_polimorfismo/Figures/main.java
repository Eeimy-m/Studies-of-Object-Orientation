package Interface_e_polimorfismo.Figures;

import java.util.Arrays;

public class main {
    static void main() {
        Figure[] figures = new Figure[150];
        int radius = 1;
        int length = 1;
        int widith = 1;
        int a = 1, b = 1, c = 1;
        double maxArea = 0;

        for(int i = 0; i < 50; i++) {
            if(i < 50) {
                Circle circle = new Circle(radius++);
                maxArea += circle.area();
                figures[i] = circle;
            }
            else if(i < 100) {
                Rectangle rectangle = new Rectangle(widith++, length++);
                maxArea += rectangle.area();
                figures[i] = rectangle;
            }
            else {
                Triangle triangle = new Triangle(a++, b++, c++);
                maxArea += triangle.area();
                figures[i] = triangle;
            }
        }

        for(Figure figure : figures) {
            maxArea += figure.area();
        }

        System.out.println(Arrays.stream(figures)
                .mapToDouble(Figure::area)
                .sum());

        System.out.println(String.format("Area: %.2f", maxArea));
    }
}
