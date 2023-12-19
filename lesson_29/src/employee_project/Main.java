package employee_project;

public class Main {
    public static void main(String[] args) {
        Employee director = new Director("John", 10000);
        Employee saleManager = new SaleManager("Robert", 8000);
        Employee secretary = new Secretary("Maria", 3000);

        Employee[]employees = {director, saleManager, secretary};
        for (Employee employee: employees){
            System.out.println(employee);
            employee.work();
            System.out.println("-------------------");
        }
    }
}
