package Buchhalter;

public abstract class Employee {
    private int id;
    private String name;
    private String secondName;
    private double hour;


    public Employee(int id, String name, String secondName, double hour) {
        this.id = id;
        this.name = name;
        this.secondName = secondName;
        this.hour = hour;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public double getHour() {
        return hour;
    }


    @Override
    public String toString() {
        return "id: " + id + ", Name:  " + name + "  " + secondName +
                ", salary: " + salary();
    }



    public abstract double salary();


}
