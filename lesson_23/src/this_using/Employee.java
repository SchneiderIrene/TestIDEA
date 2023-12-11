package this_using;

public class Employee {
    public  String name;
    public  String address;
    public int salary;

    public Employee() {
        this("John");
    }

    public Employee(String name) {
        this(name, 5000);
    }

    public Employee(String name, int salary) {
        this(name, salary, "Street1");
    }

    public Employee(String name,  int salary, String address) {
        this.name = name;
        this.address = address;
        this.salary = salary;
    }

    public  void  display (){
        System.out.println(name);
        System.out.println(salary);
        System.out.println(address);
    }
}
