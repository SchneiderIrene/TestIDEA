package stream_api;

import java.util.Arrays;

public class Map_flatMap {

    public static void main(String[] args) {
        String[]strings = {"Hello", "Java"};

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .map(Arrays::stream)
                .forEach(System.out::println);

        Arrays.stream(strings)
                .map(str -> str.split(""))
                .flatMap(Arrays::stream)
                .forEach(System.out::print);
    }
}
