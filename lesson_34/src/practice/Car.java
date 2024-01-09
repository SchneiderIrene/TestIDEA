package practice;

public class Car implements Comparable<Car>{
    private  String make;
    private int year;
    private String color;

    public Car(String make, int year, String color) {
        this.make = make;
        this.year = year;
        this.color = color;
    }

    public String getMake() {
        return make;
    }

    public int getYear() {
        return year;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return  make + " "  + year + " " +  color;
    }

    @Override
//    public int compareTo(Car o) {
//        return getMake().compareTo(o.getMake());
//    }

//    public int compareTo(Car o) {
//        return Integer.compare(getYear(), o.getYear());
//    }

    public int compareTo(Car o) {
        int carMake = getMake().compareTo(o.getMake());
        int carYear = Integer.compare(getYear(), o.getYear());
        return carMake == 0 ? carYear : carMake;
    }


}
