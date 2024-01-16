package our_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class OurListIterator {
    public static void main(String[] args) {
        List<String>cities = new ArrayList<>();
        cities.add("Berlin");
        cities.add("Paris");
        cities.add("Rome");
        cities.add("Madrid");

        ListIterator<String>listIterator = cities.listIterator();
        while (listIterator.hasNext()){
            System.out.println(listIterator.next());
        }

        listIterator.set("London");

        System.out.println("Cities after, reversed");
        System.out.println("------------------------");

        while (listIterator.hasPrevious()){
            System.out.println(listIterator.previous());
        }

    }
}
