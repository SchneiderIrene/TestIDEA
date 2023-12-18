package cons;

public class Main {
    public static void main(String[] args) {
        Boy b = new Boy(100);
        System.out.println(b.getNewHeight());

        Employee emp = new Employee("John Smith", 35, 5000,
                new Address("Street", 5, "New-York"));
        System.out.println(emp);

        System.out.println(emp.address);
    }
}
