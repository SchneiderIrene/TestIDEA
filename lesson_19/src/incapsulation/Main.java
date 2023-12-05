package incapsulation;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("John", 45,"Street1", 5000);
        System.out.print(emp.name + ": ");
        System.out.println("Age is " + emp.age);
    }

}
