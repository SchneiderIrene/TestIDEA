package trucks;

public class Main {
    public static void main(String[] args) {
    Truck t1 = new Truck(
            "Man",
            "Man",
            2005, "grey",
            "Petrov Vasiliy",
            3000,
            70
    );
        System.out.println(t1);
        t1.load(600);
        t1.unload(500);
        t1.fuel(80);
        t1.doNotGo();
        System.out.println("Owner: " + t1.getNameOwner());

    }
}
