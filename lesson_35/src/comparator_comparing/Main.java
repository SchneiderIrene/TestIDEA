package comparator_comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Jack", 33);
        Person person2 = new Person("John", 32);
        Person person3 = new Person("Ann", 30);
        Person person8 = new Person("Ann", 39);
        Person person4 = new Person("Kate", 27);
        Person person9 = new Person("Kate", 21);
        Person person5 = new Person("Rob", 36);
        Person person6 = new Person("Joy", 41);
        Person person7 = new Person("Adam", 32);

        Person[]people = {person1, person2, person3, person4, person5, person6, person7, person8, person9};

        Comparator<Person> comparator= new NameComparator().thenComparing(new AgeComparator());

        Arrays.sort(people, comparator);
        for (Person person: people){
            System.out.println(person);
        }

    }
}
