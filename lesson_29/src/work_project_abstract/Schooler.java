package work_project_abstract;

public abstract class Schooler {
    String name;
    String surname;
    int age;
    String sex;

    public Schooler(String name, String surname, int age, String sex) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.sex = sex;
    }

    public abstract void work ();

    @Override
    public String toString() {
        return "Name: " + name + ", age: " + age;
    }
}
