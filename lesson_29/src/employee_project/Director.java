package employee_project;

public class Director extends Employee{
    private static String TYTLE = "Director";

    public Director(String name, int salary) {
        super(TYTLE, name, salary);
    }

    @Override
    public void work() {
        System.out.println(TYTLE + " " + getName() + " manage the company. He has salary " + getSalary());
    }
}
