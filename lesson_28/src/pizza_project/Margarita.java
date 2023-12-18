package pizza_project;

public class Margarita extends Pizza{
    private static String TYPE = "Margarita";

    public Margarita() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with mozzarella cheese and tomatoes");
    }
}
