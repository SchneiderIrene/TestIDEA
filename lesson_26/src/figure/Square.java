package figure;

public class Square extends Figure{
    private double a;

    public Square(String name, double a) {
        super(name);
        this.a = a;
    }

    @Override
    public double findArea() {
        return a*a;
    }
}
