package cons;

import incapsulation.Employee;

public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee("John", 35, "Street1", 5000);
        Employee emp2 = new Employee("Kate", 25, "Street1", 4500);
        System.out.println(emp1.getName());
        System.out.println(emp1.getAge());
        System.out.println(emp1.getAddress());
        System.out.println(emp1.getSalary());


        emp1.setName("Jack");
        System.out.println(emp1.getName());
        emp1.setAge(-45);
        System.out.println(emp1.getAge());
        emp1.setAddress("Street3");
        System.out.println(emp1.getAddress());
        emp1.setSalary(400000);
        System.out.println(emp1.getSalary());


        System.out.println(emp1);
        System.out.println(emp1.toString());
        System.out.println(emp2);

    }
}
