package abstractClasses;

public class Main {
    public static void main(String[] args) {
        Animal lion = new Lion("Lion");
        lion.sound();
        Animal dog = new Dog("Dog");
        dog.sound();
       // Animal animal = new Animal();

        Animal wolf = new Wolf("Wolf");
        wolf.sound();
        wolf.move();
    }


}
