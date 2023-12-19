package employee_project;

public class SaleManager extends Employee{
    private static String TYTLE = "Sale Manager";

    public SaleManager(String name, int salary) {
        super(TYTLE, name, salary);
    }
    @Override
    public void work() {
        System.out.println(TYTLE + " " + getName() + " sells goods. He has salary " + getSalary());
    }
}
