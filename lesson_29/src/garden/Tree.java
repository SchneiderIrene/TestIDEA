package garden;

public class Tree extends Plant{
    private static int GROWTH = 10;
    public Tree(String displayName, int height, int age) {
        super ( displayName, height, age);
    }

    @Override
    public int spring() {
        return super.spring();
    }

    public  int summer(){
        System.out.println("Summer: " + getDisplayName() + " has grown in  by " + GROWTH + "cm");
        return GROWTH();
    }
    public  int autumns(){
        System.out.println("Autumns: " + getDisplayName() +  " doesn't grow");
        return 0;
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
