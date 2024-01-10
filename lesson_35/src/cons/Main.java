package cons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car(234567, "Mercedes", 2005, 280000);
        Car car2 = new Car(244567, "Mercedes", 2015, 180000);
        Car car3 = new Car(254567, "Mercedes", 2023, 80000);
        Car car4 = new Car(754567, "Audi", 2023, 70000);
        Car car5 = new Car(714567, "Audi", 2013, 170500);
        Car car6 = new Car(784567, "BMW", 2019, 19900);
        Car car7 = new Car(784560, "BMW", 2008, 309900);

        Car[] cars = {car1, car2, car3, car4, car5, car6, car7};

        System.out.println("Sort by licence");
        Arrays.sort(cars);
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------------");

        System.out.println("Sort by year");
        Arrays.sort(cars, new YearComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------------");

        System.out.println("Sort by make");
        Arrays.sort(cars, new MakeComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------------");

        System.out.println("Sort by km");
        Arrays.sort(cars, new KmComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------------");

        System.out.println("Sort by year and make");
        Arrays.sort(cars, new YearMakeComparator());
        for (Car car : cars) {
            System.out.println(car);
        }
        System.out.println("---------------------------");
    }
}
