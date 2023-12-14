package trucks;

public class Car {
    String model;
    String manufacturer;
    int year;
    String color;
   private String nameOwner;
    int maxFuel;
    int currentF = 0;

    public Car(String model, String manufacturer, int year, String color, String nameOwner, int maxFuel) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.color = color;
        this.nameOwner = nameOwner;
        this.maxFuel = maxFuel;
    }

    public String getNameOwner() {
        return nameOwner;
    }

    public void setNameOwner(String nameOwner) {
        this.nameOwner = nameOwner;
    }

    public void fuel(int f) {
        if (f > maxFuel) {
            System.out.println("To much fuel");
        } else {
            currentF = f;
            System.out.println("Fueled " + f + " l");
            System.out.println("Truck is refueled");
        }
    }

    public void doNotGo() {
        System.out.println("You do not fare");
    }

    public String toString() {
        return "Car: " + model + " " + manufacturer + ", year: " + year + ", color: " + color
                + ", maxFuel: " + maxFuel + " l" + ". Owner: " + nameOwner;
    }
}
