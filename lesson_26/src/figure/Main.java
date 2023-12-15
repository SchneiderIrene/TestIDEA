package figure;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Circle("Circle", 10);
        Figure rectangle = new Rectangle("Rectangle", 5, 10);
        Figure square = new Square("Square", 5);
        Figure figure = new Figure("Figure");

        Figure[]figures = {circle, rectangle, square, figure};
        for (Figure f: figures) {
            System.out.println(f.getName() + " has area of " + f.findArea());
        }

        for (Figure f: figures) {
            System.out.println(f);
        }
    }

}
