package garden;

public class Flower extends Plant {
    private static final int GROWTH = 15;

    public Flower(String displayName, int height, int age) {
        super(displayName, height, age);
    }

    public  int summer(){
        System.out.println("Summer: " + getDisplayName() + " blooms");
        return 0;
    }
    public  int autumns(){
        System.out.println("Autumns: " + getDisplayName() + " cut");
        return -GROWTH;
    }

    @Override
    public int GROWTH() {
        return GROWTH;
    }
}












