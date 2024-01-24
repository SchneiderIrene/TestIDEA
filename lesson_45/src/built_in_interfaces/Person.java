package built_in_interfaces;

public class Person {

     private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "My name is " + name;
    }
}
