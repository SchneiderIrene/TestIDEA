package employee_project;

public class Secretary extends Employee{
    private static String TYTLE = "Secretary";

    public Secretary(String name, int salary) {
        super(TYTLE, name, salary);
    }

    @Override
    public void work() {
        System.out.println(TYTLE + " " + getName() + " does paperwork. He has salary " + getSalary());
    }
}
