package generics;

import java.util.Arrays;

public class Display {

    public <T> void display (T[] objects){
        System.out.println(Arrays.toString(objects));
        for (T t: objects){
            System.out.println(t);
        }
    }
}
