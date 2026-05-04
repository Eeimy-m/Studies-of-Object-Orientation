package Heranca.Figure;

public class main {
    public static void main(String[] args) {
        Figure[] figures = new Figure[100];

        for(int i = 0; i < 50; i++) {
            figures[i] = new Circle(i + 1, i + 1, i + 1);
            figures[i + 50] = new Rectangle(i+1, i+1, i+1, i+1);
        }

        double total = 0;
        for(Figure figure : figures) {
            System.out.println(figure);
            total+=figure.area();
        }
        System.out.println(total);

//        Figure circle = new Circle(2.0, 3.0, 1.0);
//        System.out.println(circle);
    }
}
