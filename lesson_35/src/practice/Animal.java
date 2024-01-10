package practice;

import java.util.Comparator;

public class Animal implements Comparator <Animal> {
    private String name;
    private int weight;
    private String color;

    public Animal(String name, int weight, String color) {
        this.name = name;
        this.weight = weight;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public int compare(Animal o1, Animal o2) {
        return 0;
    }
}
