package staticMethods;

public class Car {
    private String name;
    private int year;
    private static int carCounter;

    public Car(String name, int year) {
        this.name = name;
        this.year = year;
        carCounter++;
    }

    public static void setCarCounter(int carCounter) {
        Car.carCounter = carCounter;
    }

    public static int getCarCounter() {
        return carCounter;
    }

    public static String getYearInfo(Car car){
        return car.name + " production year " + car.year;
    }
}
