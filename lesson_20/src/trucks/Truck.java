package trucks;

public class Truck extends Car{

    int maxWeight;
    int currentL = 0;


    public Truck(String model, String manufacturer, int year, String color, String nameOwner, int maxFuel, int maxWeight) {
        super(model, manufacturer, year, color, nameOwner,maxFuel);
        this.maxWeight = maxWeight;
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

    public void doNotGo () {
        if (currentL == 0 || currentF == 0) {
            System.out.println("You do not fare. No load oder fuel");
        } else System.out.println("I'm ready to fare");
    }

    public String toString (){
        return "Truck: " + model + " " + manufacturer + ", year: " + year + ", color: " + color +
                ", max Weight: " + maxWeight + " kg" + ", maxFuel: " +  maxFuel + " l" + ". Owner: " + nameOwner;

    }


}
