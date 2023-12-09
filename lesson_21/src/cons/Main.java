package cons;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Volvo", 2005);
        Car car2 = new Car("Ford", 2005);

        System.out.println(Car.counterBrand);
        System.out.println(Car.counterYear);

    }
}
