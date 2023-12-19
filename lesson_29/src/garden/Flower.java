package garden;

public class Flower extends Plant {
    private static int GROWTH = 15;

    public Flower(String displayName, int height, int age) {
        super(displayName, height, age);
    }

    @Override
    public int spring() {
        return super.spring();
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
    public int winter() {
        return super.winter();
    }
    @Override
    public int GROWTH() {
        return GROWTH;
    }
}












