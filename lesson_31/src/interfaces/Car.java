package interfaces;

public class Car extends Auto implements Movable, Breakable{



    @Override
    public void canMove() {
        System.out.println("A car can drive");
    }

    @Override
    public void canStop() {
        System.out.println("A car can stop");
    }

    @Override
    public void canBreak() {
        System.out.println("A car can break");
    }
}
