package cons;

public class Voter {
    String name;
    int age;
    String address;

    public Voter(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
        if (age<16) {
            System.out.println(name + " must be over 18 years old");
        }
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

        if (age<16) {
            System.out.println(name + " must be over 18 years old");
        }
        else this.age = age;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    public String toString (){
            return "Voter's name is: " + name + ", age: " + age + ", address: " + address;
    }

    public static void main(String[] args) {
        Voter voter1 = new Voter("Petrov Alexander", 35, "Street1");
        System.out.println(voter1);

        Voter voter2 = new Voter("Ivanova Maria", 25, "Street2");
        System.out.println(voter2);

        Voter voter3 = new Voter("Sidorov Viktor", 55, "Street3");
        voter3.setAge(15);
        System.out.println(voter3);

        Voter voter4 = new Voter("Sidorov Pavel", 15, "Street4");
        System.out.println(voter4);

        Voter[]voters = {voter1, voter2, voter3, voter4};
        for (Voter voter: voters){
            System.out.println(voter);
        }
    }
}
