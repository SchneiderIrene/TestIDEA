package default_methods;

public class OurClass implements OurDefaultInterface, OurDefaultInterface1{
    @Override
    public int getUserID() {
        return 50;
    }

    @Override
    public int getAdminID() {
        return 100;
    }
}
