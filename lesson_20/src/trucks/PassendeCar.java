package trucks;

public class PassendeCar extends Car{
    int numberOfPass;

    public PassendeCar(String model, String manufacturer, int year, String color, String nameOwner, int maxFuel, int numberOfPass) {
        super(model, manufacturer, year, color, nameOwner,maxFuel);
        this.numberOfPass = numberOfPass;
    }
    public void doNotGo () {
        if (numberOfPass == 0 || currentF == 0) {
            System.out.println("You do not fare");
        } else System.out.println("Number Of Passengers: " + numberOfPass +  ". I'm ready to fare");
    }

    public void numPass (int numberOfPass){
        System.out.println("All passengers are seated");
    }

    public String toString (){
        return "Auto: " + model + " " + manufacturer + ", year: " + year + ", color: " + color +
                ", number of passengers: " + numberOfPass + " persons" + ", maxFuel: " +  maxFuel + " l" + ". Owner: " + nameOwner;

    }
}
