package figure;

public class Rectangle extends Figure{
    private double l;
    private double w;

    public Rectangle(String name, double l, double w) {
        super(name);
        this.l = l;
        this.w = w;
    }

    @Override
    public double findArea() {
        return l*w;
    }
}
