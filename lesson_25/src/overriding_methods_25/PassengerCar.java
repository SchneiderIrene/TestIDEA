package overriding_methods_25;

public class PassengerCar extends Car{
    @Override
    public void drive() {
        System.out.println("Passenger Car carries passengers");
    }

    public void pass() {
        System.out.println("Pass");
    }
}
