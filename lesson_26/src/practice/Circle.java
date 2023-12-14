package practice;

public class Circle extends Area{
    int rad;

    @Override
    public String area(int i) {

        return String.format("%.2f", (Math.PI)*i*i);
    }

    @Override
    public String toString() {
        return "Circle " + super.toString();
    }
}
