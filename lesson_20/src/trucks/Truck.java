package trucks;

public class Truck {
    private String model;
    private String manufacturer;
    private int year;
    private String color;
    private String nameOwner;
    private int maxWeight;
    private int currentL = 0;
    private int maxFuel;
    private int currentF = 0;


    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public Truck(String model, String manufacturer, int year, String color, String nameOwner, int maxWeight, int maxFuel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.nameOwner = nameOwner;
        this.maxWeight = maxWeight;
        this.maxFuel = maxFuel;
    }

    public void load (int l){
        if (l>maxWeight){
            System.out.println("Maximum weight exceeded");
        }
        else {
            int rest = maxWeight - l;
            currentL = l;
            System.out.println("Loading " + l + " kg");
            System.out.println("You can load another " + rest + " kg");
        }
    }

    public  void  unload (int u){
        if (u>currentL){
            System.out.println("You are trying to unload more than you have");
        }
        else {
            int rest = currentL - u;
            System.out.println("Unloading " + u + " kg");
            System.out.println("You can unload another " + rest + " kg");
        }
    }

    public void fuel (int f){
        if (f>maxFuel){
            System.out.println("To much fuel");
        }
        else {
            currentF = f;
            System.out.println("Fueled " + f + " l");
            System.out.println("Truck is refueled");
        }

    }


    public void doNotGo (){
        if (currentL == 0 || currentF == 0){
            System.out.println("You do not fare");
        }
        else  System.out.println("I'm ready to fare");
    }

    public String toString (){
        return "Truck: " + model + " " + manufacturer + ", year: " + year + ", color: " + color +
                ", max Weight: " + maxWeight + " kg" + ", maxFuel: " +  maxFuel + " l" + ". Owner: " + nameOwner;

    }
}
