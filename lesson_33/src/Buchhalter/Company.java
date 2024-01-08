package Buchhalter;

public class Company {

    private Employee[] employees;
    private int companySize;

    public Company(int capacity) {
        employees = new Employee[capacity];
        companySize = 0;
    }


    public void addEmployee(Employee emp) {
        if (companySize < employees.length) {
            employees[companySize] = emp;
            companySize++;
        }
    }

    public void removeEmployee (Employee emp) {
        for (int i = 0; i < companySize; i++) {
            if (employees[i].equals(emp)) {
                employees[i] = employees[companySize - 1];
                companySize--;
            }
        }
    }

    public void display(){
        for (int i = 0; i < companySize; i++){
            System.out.println(employees[i]);
        }
    }

    public double sumSalary (){
        double sum = 0;
        for (int i = 0; i<companySize; i++){
           sum+= employees[i].salary();
        }
        return sum;
    }

}
