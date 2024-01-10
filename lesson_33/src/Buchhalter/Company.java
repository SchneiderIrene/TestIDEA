package Buchhalter;

import java.util.Arrays;

public class Company  {

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
       sortSecondName(employees);
        for (int i = 0; i < companySize; i++){
            System.out.println(employees[i]);
        }
    }

    public void displaySortID(){
        sortID(employees);
        for (int i = 0; i < companySize; i++){
            System.out.println(employees[i]);
        }
    }

    public void displaySortNameID(){
        sortNameId (employees);
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

    public void sortSecondName(Employee[]employees){

        Arrays.sort(employees, 0,companySize);
    }

    public void sortID (Employee[] employees){

        Arrays.sort(employees,  0, companySize, new IdComparator());
    }

    public void  sortNameId(Employee[]employees){
        Arrays.sort(employees,  0, companySize, new NameIdComporator());
    }





}
