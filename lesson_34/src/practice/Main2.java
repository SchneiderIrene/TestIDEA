package practice;

import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        Car car1 = new Car("Mercedes", 2005, "black");
        Car car2 = new Car("BMW", 2015, "red");
        Car car3 = new Car("BMW", 2017, "yellow");
        Car car4 = new Car("Fiat", 2023, "white");
        Car car6 = new Car("Fiat", 2003, "white");
        Car car7 = new Car("Fiat", 2000, "white");
        Car car5 = new Car("Citroen", 2013, "orange");
        Car car8 = new Car("Citroen", 2023, "orange");

        Car[]cars = {car1, car2, car3, car4, car5, car6, car7, car8};
        Arrays.sort(cars);
        for (Car car: cars){
            System.out.println(car);
        }
    }
}
