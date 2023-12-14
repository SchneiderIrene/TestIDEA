package practice;

public class Main {
    public static void main(String[] args) {
    Area circle = new Circle();
    Area rectangle = new Rectangle(8);
    Area square = new Square();
        System.out.println(circle.area(4));
        System.out.println(rectangle.area(7));
        System.out.println(square.area(6));

    }

}
