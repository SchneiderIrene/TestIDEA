package practice;

public class Rectangle extends Area{
    int w;

    public Rectangle(int w) {
        this.w = w;
    }

    @Override
    public String area(int i) {
        return String.format("%d", (i*w));
    }

    @Override
    public String toString() {
        return "Rectangle " + super.toString();
    }
}
