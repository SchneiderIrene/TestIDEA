package overriding_methods_25;

public class Main {
    public static void main(String[] args) {
        Truck truck = new Truck();
        truck.drive();
        truck.stop();

        Car car = new Car();
        car.drive();

        PassengerCar passengerCar = new PassengerCar();
        passengerCar.drive();
        passengerCar.stop();

        Car truck1 = new Truck();
        truck1.drive();
        truck1.stop();
        truck1 = new PassengerCar();

        Car passsengerCar = new PassengerCar();

        truck.truck();

        printCar(truck1);
        printCar(passsengerCar);
        printCar(passengerCar);
        printCar(truck);
        printCar(car);
    }

    public static void printCar (Car car){
        car.drive();
    }


}
