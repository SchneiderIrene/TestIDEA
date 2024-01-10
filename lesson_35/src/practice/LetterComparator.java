package practice;

import java.util.Comparator;

public class LetterComparator implements Comparator<Animal> {
    @Override
//    public int compare(Animal o1, Animal o2) {
//        StringBuilder sb1 = new StringBuilder(o1.getName());
//        StringBuilder sb2 = new StringBuilder(o2.getName());
//        sb1.reverse();
//        sb2.reverse();
//        return sb1.compareTo(sb2);
//    }

//    public int compare(Animal o1, Animal o2) {
//        return o1.getName().substring(o1.getName().length()-1).
//               compareTo( o2.getName().substring(o2.getName().length()-1));
//
//    }
    public int compare(Animal o1, Animal o2) {

//    String animalName1 = o1.getName();
//    String animalName2 = o2.getName();
//        return animalName1.charAt(animalName1.length()-1) - animalName2.charAt(animalName2.length()-1);
        return o1.getName().charAt(o1.getName().length()-1) - o2.getName().charAt(o2.getName().length()-1);

    }

}
