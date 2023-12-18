package cons;

public class Employee {
    String name;
    int age;
    int salary;
    Address address;

    public Employee(String name, int age, int salary, Address address) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Name of Employee - " + name + ", age " + age + ", salary " + salary +
                ", address: " + address;
    }
}
