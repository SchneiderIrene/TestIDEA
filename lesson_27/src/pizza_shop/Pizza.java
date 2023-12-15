package pizza_shop;

public class Pizza {
    String name;


    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.println(name + " prepare...");
    }

    public void bake() {
        System.out.println(name + " bake...");
    }

    public void pack() {
        System.out.println(name + " pack...");
    }



    @Override
    public String toString() {
        return name;
    }
}
