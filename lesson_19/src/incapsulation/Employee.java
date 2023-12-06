package incapsulation;

public class Employee {
    String name;
    int age;
    String address;
    int salary;

    public Employee(String name, int age, String address, int salary) {
        this.name = name;
        this.age = age;
        this.address = address;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age>17){
            this.age = age;
        } else {
            System.out.println("Employee's age can not be less than 18 !");
        }

    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        if (salary < 0 || salary > 10000){
            System.out.println("Salary is the wrong range");
        }
        else {
            this.salary = salary;
        }
    }

    public String toString(){
        return "Employee " + name + ": " + "Age: " + age + ", " + "Address: " + address + ", Salary: " + salary;
    }
}
