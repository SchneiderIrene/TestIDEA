package pizza_project;

public class Hawaii extends Pizza{
    private static String TYPE = "Pizza Hawaii";
    public Hawaii() {
        super(TYPE);
    }

    @Override
    protected void prepare() {
        System.out.println("Preparing pizza with pineapple and cheese");
    }
}
