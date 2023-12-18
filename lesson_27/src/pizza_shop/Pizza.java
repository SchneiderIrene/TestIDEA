package pizza_shop;

public class Pizza {
    private String name;


    public Pizza(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void prepare() {
        System.out.print(name + " prepare... ");
    }

    public void bake() {
        System.out.print(name + " bake... ");
    }

    public void pack() {
        System.out.println(name + " pack... ");
    }

    public void orderPizza() {
            prepare();
            bake();
            pack();

    }



    @Override
    public String toString() {
        return name;
    }
}
