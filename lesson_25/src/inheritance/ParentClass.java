package inheritance;

public class ParentClass {
    String name;
    int age;
    public ParentClass(String name) {
        this.name = name;
        System.out.println("I am Parent Class Constructor " + this.name);
    }

    public ParentClass(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("I am Parent Class Constructor " + this.name + " " + this.age);
    }
}
