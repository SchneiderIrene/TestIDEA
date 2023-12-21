package interfaces;

public class Main {
    public static void main(String[] args) {
        Two two = new Two();
        two.setInit(6);
        System.out.println(two.getNext());
        two.reset();
        two.previos();

        Three three = new Three();

        Serial two1 = new Two();
        Serial tree1 = new Three();

        Car car = new Car();
        car.canMove();
        car.canStop();

        Movable carM = new Car();
        carM.canMove();
        carM.canStop();

        Breakable carB = new Car();
        carB.canBreak();
    }
}
