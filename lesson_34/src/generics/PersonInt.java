package generics;

public class PersonInt  implements Personable<Integer>{
    // public class PersonInt<T>  implements Personable<T>
    String name;
    int age;

    public PersonInt(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }


    @Override
    public Integer getAge() {
        return null;
    }
}
