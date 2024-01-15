package our_linkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> numbers = new ArrayList<>();
        numbers.add("One");
        numbers.add("Two");
        numbers.add("Three");
        numbers.add("Four");

        Iterator<String> iterator = numbers.iterator();
        while (iterator.hasNext()){
           String nextString =  iterator.next();
            System.out.println(nextString);

            if (nextString.equals("Two")){
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}
