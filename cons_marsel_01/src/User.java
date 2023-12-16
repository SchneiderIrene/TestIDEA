public class User {
   private String name;
    private int age;



    public int getAge() {
        return age;
    }

    public User(String name, int age) {
        setName(name);
        setAge(age);
    }

    public void setAge(int Age) {
        if (Age>0){
            age = Age;
        }
        else {
            age = 1;
            System.err.println("Возраст не может быть отрицательным");

        }

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
