package cons;

public class Schooler {
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

    public void work (){
        System.out.println("I worked");
    }

    @Override
    public String toString() {
        return "Schooler{" +
                "name = '" + name + '\'' +
                ", surname = '" + surname + '\'' +
                ", age = " + age +
                ", sex = '" + sex + '\'' +
                '}';
    }
}
