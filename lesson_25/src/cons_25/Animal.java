package cons_25;

public class Animal {
    String art;
    int age;
    String color;
    boolean predator;


    public Animal(String art, int age, String color, boolean predator) {
        this.art = art;
        this.age = age;
        this.color = color;
        this.predator = predator;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "art='" + art + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", predator=" + predator +
                '}';
    }

    public void move (){
        System.out.println("Animal can move");
    }
}
