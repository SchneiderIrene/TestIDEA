package overriding_methods;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Horse horse = new Horse();
        animal.sound();
        dog.sound();
        horse.sound();

        Animal dog1 = new Dog();
        Animal horse1 = new Horse();
        dog1.sound();
        horse1.sound();

        horse.run();
        horse1.sound();
        horse.animal();
        horse1.animal();


    }


}
