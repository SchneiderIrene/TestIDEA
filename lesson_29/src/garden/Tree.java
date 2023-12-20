package garden;

public class Tree extends Plant{
    private static final int GROWTH = 10;
    public Tree(String displayName, int height, int age) {
        super ( displayName, height, age);
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
    public int GROWTH() {
        return GROWTH;
    }

}
