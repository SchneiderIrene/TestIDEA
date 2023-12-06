package cons;

public class Voter {
    String name;
    int age;
    String address;

    public Voter(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getAddress() {
        return address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void restriction(){
        if (age<16){
            System.out.println("Must be over 18 years old");
        }
    }

    public String toString (){
        if (age<16) {
            return "";
        } else {
            return "Voter's name is: " + name + ", age: " + age + ", address: " + address;
        }
    }

    public static void main(String[] args) {
        Voter voter1 = new Voter("Petrov Alexander", 35, "Street1");
        voter1.restriction();
        System.out.println(voter1);

        Voter voter2 = new Voter("Ivanova Maria", 25, "Street2");
        voter2.restriction();
        System.out.println(voter2);

        Voter voter3 = new Voter("Sidorov Viktor", 15, "Street3");
        voter3.restriction();
        System.out.println(voter3);
    }
}
