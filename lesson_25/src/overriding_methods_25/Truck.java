package overriding_methods_25;

public class Truck extends Car {
    @Override
    public void drive() {
        System.out.println("A truck carries a load");
    }

    public void truck() {
        System.out.println("Only truck");
    }
}
