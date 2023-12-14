package practice;

public class Circle extends Area{
    int rad;

    @Override
    public double area(int i) {
        return (Math.PI)*i*i;
    }
}
