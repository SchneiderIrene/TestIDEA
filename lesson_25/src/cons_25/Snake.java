package cons_25;

public class Snake extends Animal{
    boolean poisonous;
    int length;

    public Snake(String art, int age, String color, boolean predator, boolean poisonous, int length) {
        super(art, age, color, predator);
        this.poisonous = poisonous;
        this.length = length;
    }

    @Override
    public String toString() {
        return "Snake{" +
                "poisonous=" + poisonous +
                ", length=" + length +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", predator=" + predator +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Snake crawls");
    }
}
