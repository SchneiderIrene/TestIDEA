package our_iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer>input = new ArrayList<>();
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);
        input.add(5);
        input.add(6);
        input.add(7);
        input.add(8);
        System.out.println(returnWithoutEl(input, 6));
        System.out.println(returnWithoutEl2(input, 6));
    }

    public static List<Integer> returnWithoutEl (List<Integer>input, int n){
        Iterator<Integer> iterator = input.iterator();

        while (iterator.hasNext()){
            if(iterator.next()>=n){
                iterator.remove();
            }
        }
        return input;
    }

    public static List<Integer> returnWithoutEl2 (List<Integer>input, int n) {
        List<Integer> output = new ArrayList<>();
        for (Integer i : input) {
            if (i < n) {
                output.add(i);
            }
        }
        return output;
    }
}
