package Buchhalter;

public class WageEmployee extends Employee{
    private double wage;


    public WageEmployee(int id, String name, String secondName,  double hour, double wage) {
        super(id, name, secondName, hour);
        this.wage = wage;
    }

    public double getWage() {
        return wage;
    }

    @Override
    public String toString() {
        return  "WageEmployee:  " +  super.toString() + ", wage " + wage;
    }

    @Override
    public double salary() {
        double salary = getHour()* wage;
        return Math.max(salary, StateConstant.MIN_SALARY);
    }
}
