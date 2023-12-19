package employee_project;

public abstract class Employee {
    private String tytle;
    private String name;
    private int salary;

    public Employee(String tytle, String name, int salary) {
        this.tytle = tytle;
        this.name = name;
        this.salary = salary;
    }
    public abstract void work();

    public String getTytle() {
        return tytle;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Title of Employee: " +  tytle + ", name of Employee: " + name +  ", salary of Employee: " + salary;
    }
}
