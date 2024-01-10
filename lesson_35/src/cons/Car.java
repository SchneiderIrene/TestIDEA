package cons;

public class Car implements Comparable<Car>{
    private int licence;
    private String make;
    private int year;
    private int km;

    public Car(int licence, String make, int year, int km) {
        this.licence = licence;
        this.make = make;
        this.year = year;
        this.km = km;
    }

    public int getLicence() {
        return licence;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public int getKm() {
        return km;
    }

    @Override
    public String toString() {
        return make + " " + year + " licence: " + licence + ", " + km + "km";
    }

    @Override
    public int compareTo(Car o) {
        return Integer.compare(getLicence(), o.getLicence());
    }
}
