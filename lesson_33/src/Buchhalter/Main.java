package Buchhalter;

public class Main {
    public static void main(String[] args) {
        Employee wageEmployee1 = new WageEmployee(1, "John", "Smith", 150, 15);
        Employee wageEmployee2 = new WageEmployee(2, "Jack", "Black", 170, 11);
        Employee wageEmployee3 = new WageEmployee(3, "Ann", "Potter", 70, 17);

        Employee salesManager1 = new SalesManager(4, "Rob", "White", 210, 4000, 0.1);
        Employee salesManager2 = new SalesManager(5, "Kate", "Blue", 30, 100000, 0.05);
        Employee salesManager3 = new SalesManager(6, "Peter", "Star", 120, 200000, 0.15);


        Company company = new Company(10);

        company.addEmployee(wageEmployee1);
        company.addEmployee(wageEmployee2);
        company.addEmployee(wageEmployee3);
        company.addEmployee(salesManager1);
        company.addEmployee(salesManager2);
        company.addEmployee(salesManager3);
        company.display();
        System.out.println(company.sumSalary());
        System.out.println("---------------------------");
        company.removeEmployee(wageEmployee1);
        company.display();

    }
}
