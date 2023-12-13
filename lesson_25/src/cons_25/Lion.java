package cons_25;

public class Lion extends Animal{
    int lengthOfMane;
    public Lion(String art, int age, String color, boolean predator, int lengthOfMane) {
        super(art, age, color, predator);
        this.lengthOfMane = lengthOfMane;
    }

    @Override
    public String toString() {
        return "Lion{" +
                "lengthOfMane=" + lengthOfMane +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", predator=" + predator +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Lion runs very fast");
    }
}
