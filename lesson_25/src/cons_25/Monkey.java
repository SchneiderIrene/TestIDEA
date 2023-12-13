package cons_25;

public class Monkey extends Animal{
    int jumpAbility;
    int tailLength;

    public Monkey(String art, int age, String color, boolean predator,
                  int jumpAbility, int tailLength) {
        super(art, age, color, predator);
        this.jumpAbility = jumpAbility;
        this.tailLength = tailLength;
    }

    @Override
    public String toString() {
        return "Monkey{" +
                "jumpAbility=" + jumpAbility +
                ", tailLength=" + tailLength +
                ", art='" + art + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", predator=" + predator +
                '}';
    }

    @Override
    public void move() {
        System.out.println("Monkey jumps high int the trees");
    }
}
