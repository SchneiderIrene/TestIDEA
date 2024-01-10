package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Animal animal1 = new Animal("Lion", 130, "yellow");
        Animal animal2 = new Animal("Wolf", 90, "grey");
        Animal animal3 = new Animal("Anaconda", 30, "green");
        Animal animal4 = new Animal("Bear", 300, "braun");
        Animal animal5 = new Animal("Fox", 15, "red");
        Animal animal6 = new Animal("Elephant", 500, "blue");

        Animal[]animals = {animal1, animal2, animal3, animal4, animal5, animal6};

        System.out.println("Before sorting");
        for (Animal animal: animals){
            System.out.println(animal);
        }
        System.out.println("-------------------------------");

        System.out.println("Sort by name of animal");
        Arrays.sort(animals, new NameComporator());
        for (Animal animal: animals){
            System.out.println(animal);
        }
        System.out.println("-------------------------------");

        System.out.println("Sort by weight of animal");
        Arrays.sort(animals, new WeightComparator());
        for (Animal animal: animals){
            System.out.println(animal);
        }
        System.out.println("-------------------------------");

        System.out.println("Sort by last letter of name");
        Arrays.sort(animals, new LetterComparator());
        for (Animal animal: animals){
            System.out.println(animal.getName());
        }
        System.out.println("-------------------------------");

    }
}
