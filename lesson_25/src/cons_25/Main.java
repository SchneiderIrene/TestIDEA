package cons_25;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Animal", 0, "Colorless", false);
        Animal monkey = new Monkey("Monkey", 10, "brown", false, 9, 100);
        Animal lion = new Lion("Lion", 25, "gold", true, 150);
        Animal bird = new Bird("Crow", 5, "black", true, "grey", 100);
        Animal snake = new Snake("Anaconda", 10, "black-yellow", true, false, 25);

        Animal[] zoo = {animal, monkey, lion, bird, snake};
        for (Animal an: zoo){
            System.out.println(an);
        }

        System.out.println("All the beasts can move the following way: ");

        for (Animal an: zoo){
            an.move();
        }



    }

}
