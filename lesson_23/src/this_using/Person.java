package this_using;

public class Person {
    String name;
    int age;
    int height;
    int weight;

    public Person() {
        System.out.println("This is a no arguments constructor");
    }
    public Person(String name, int age) {
        this();
        this.name = name;
        this.age = age;
    }


    public Person(String name, int age, int height) {
        this(name,age);
        this.height = height;
    }

    public Person(String name, int age, int height, int weight) {
        this(name, age, height);
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }
}
