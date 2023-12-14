package practice;

public class Rectangle extends Area{
    int w;

    public Rectangle(int w) {
        this.w = w;
    }

    @Override
    public double area(int i) {
        return i*w;
    }
}
