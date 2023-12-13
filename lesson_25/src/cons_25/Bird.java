package cons_25;

public class Bird extends Animal{
    String additionalColor;
    int flyHeight;

    public Bird(String art, int age, String color, boolean predator, String additionalColor, int flyHeight) {
        super(art, age, color, predator);
        this.additionalColor = additionalColor;
        this.flyHeight = flyHeight;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "additionalColor='" + additionalColor + '\'' +
                ", flyHeight=" + flyHeight +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", predator=" + predator +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Bird fly");
    }
}
