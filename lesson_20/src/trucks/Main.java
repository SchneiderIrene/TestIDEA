package trucks;

public class Main {
    public static void main(String[] args) {

        Car truck1 = new Truck("SuperVolvo", "Volvo", 2015, "red",
                "John Smith", 150, 5000);
        truck1.fuel(65);
        truck1.doNotGo();
        System.out.println(truck1.getNameOwner());
        System.out.println(truck1);
        truck1.setNameOwner("Vasya Vasilev");
        System.out.println(truck1.getNameOwner());

        System.out.println("-------------------------------------------------------");

        Truck truck2 = new Truck("SuperMan", "Man", 2010, "black",
                "Jack Wolfskin", 200, 4500);
        truck2.fuel(180);
        truck2.load(3000);
        truck2.unload(1500);
        truck2.doNotGo();
        System.out.println(truck2.getNameOwner());
        truck2.setNameOwner("Vasya Vasilev");
        System.out.println(truck2.getNameOwner());
        System.out.println(truck2);

        System.out.println("-------------------------------------------------------");

        Car passCar1 = new PassendeCar("C180", "Mercedes", 2016, "black",
                "Schneider Walter", 60, 5);
        passCar1.fuel(55);
        passCar1.doNotGo();
        System.out.println(passCar1.getNameOwner());
        passCar1.setNameOwner("John Smith");
        System.out.println(passCar1.getNameOwner());
        System.out.println(passCar1);

        System.out.println("-------------------------------------------------------");

        PassendeCar passCar2 = new PassendeCar("E280", "Mercedes", 2019, "blue",
                "Schneider Irene", 70, 5);
        passCar2.fuel(65);
        passCar2.numPass(5);
        passCar2.doNotGo();
        System.out.println(passCar2.getNameOwner());
        passCar2.setNameOwner("John Smith");
        System.out.println(passCar2.getNameOwner());
        System.out.println(passCar2);

    }
}
