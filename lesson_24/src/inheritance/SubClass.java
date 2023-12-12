package inheritance;

public class SubClass extends ParentClass{
    public SubClass(String name) {
        super(name);
        System.out.println("I am SubClass Constructor " + name);
    }

    public SubClass(String name, int age) {
        super(name, age);
        System.out.println("I am SubClass Constructor " + name + " " + age);
    }
}
