package garden;

public abstract class Plant {
    private String displayName;
    private int height;
    private int age;

    public Plant(String displayName, int height, int age) {
        this.displayName = displayName;
        this.height = height;
        this.age = age;
    }

    public String getDisplayName() {
        return displayName;
    }



    public void growPlants(int year) {
        int heightOfSeason = spring() + summer() + autumns() + winter();
        int heightResult = height + heightOfSeason * year;
        int genAge = age + year;
        System.out.println("Height of " + displayName + " in " + year + " years "
                + " is " + heightResult + "cm. Age of " + displayName + ": " + genAge + " years");
    }

    public int spring() {
        System.out.println("Spring: " + displayName + " has grown in  by " + GROWTH() + "cm");
        return GROWTH();
    }

    public abstract int summer();

    public abstract int autumns();

    public int winter() {
        System.out.println("Winter: " + displayName + " doesn't grow");
        return 0;
    }

    public abstract int GROWTH();


}
