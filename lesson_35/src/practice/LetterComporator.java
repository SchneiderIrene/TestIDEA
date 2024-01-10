package practice;

import java.util.Comparator;

public class LetterComporator implements Comparator<Animal> {
    @Override
    public int compare(Animal o1, Animal o2) {
        StringBuilder sb1 = new StringBuilder(o1.getName());
        StringBuilder sb2 = new StringBuilder(o2.getName());
        sb1.reverse();
        sb2.reverse();
        return sb1.compareTo(sb2);
    }
}
