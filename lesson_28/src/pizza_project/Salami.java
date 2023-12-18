package pizza_project;

public class Salami extends Pizza{
    private static String TYPE = "Salami";

    public Salami() {
        super(TYPE);
    }
    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with salami");
    }
}
