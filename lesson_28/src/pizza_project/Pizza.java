package pizza_project;

public class Pizza {
    private String type;

    public Pizza(String type) {
        this.type = type;
    }

    public void orderPizza (){
        prepare();
        bake();
        pack();
    }
    protected void prepare (){}
    public void bake (){
        System.out.println("Baking " + type);
    }
    public void pack (){
        System.out.println("Packing " + type);
    }

    public String getType() {
        return type;
    }
}
