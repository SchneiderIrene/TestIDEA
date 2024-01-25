package stream_api;

import java.util.*;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        int[] ints = {10, 20, 30, 40, 50, 60, 70, 80};
        int counter = 0;

        for (int i : ints) {
            if (i < 31) continue;

            i = i * 2;
            counter++;

            if (counter > 4) break;
            System.out.println(i);
        }

        System.out.println("-----------------------------------------------------");


        IntStream.of(10, 20, 30, 40, 50, 60, 70, 80)
                .filter(i -> i >= 31)
                .map(i -> i * 2)
                .limit(4).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        Stream<String> empty = Stream.empty(); //пустой

        Collection<String> collection = Arrays.asList("John", "Jack", "Ann");
        collection.stream();

        String[] arr = {"John", "Jack", "Ann"};
        Arrays.stream(arr);

        "abcd".chars();

        String s = "one";
        Stream.of(s, "two");

        IntStream intStream = IntStream.of(1,2,3);
        IntStream.range(1,10);
        IntStream.rangeClosed(1,10);

        Random random = new Random();
        random.doubles();

        Stream<String> names = Stream.of("John", "Jack", "Ann");
        names.forEach(System.out::println);

        System.out.println("-----------------------------------------------");


        System.out.println("After filter");
        names = Stream.of("John", "Jack", "Ann");
        names.filter(n -> n.length()==4).forEach(System.out::println);

        Stream<Car> carStream = Stream.of(new Car("Ford", 50000),
                new Car("Mercedes", 100000),
                new Car("Bentley", 500000));


        System.out.println("-----------------------------------------------");


        carStream.filter(p -> p.getPrice()<150000)
                .forEach(car -> System.out.println(car.getBrand()));

        System.out.println("-----------------------------------------------");

        carStream = Stream.of(new Car("Ford", 50000),
                new Car("Mercedes", 100000),
                new Car("Bentley", 500000));
        carStream.filter(p -> p.getPrice()<150000)
                .map(Car::getBrand)
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        carStream = Stream.of(new Car("Ford", 50000),
                new Car("Mercedes", 100000),
                new Car("Bentley", 500000));
        carStream.map(car -> "brand: " + car.getBrand() + ", price: " + car.getPrice())
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");


        System.out.println("Sorting...");
        System.out.println();

        List<String> cars = new ArrayList<>();
        cars.add("Mercedes");
        cars.add("Volvo");
        cars.add("Volvo");
        cars.add("Bentley");
        cars.add("Bentley");
        cars.add("Opel");
        cars.add("Opel");

        cars.stream().filter(c -> c.length()>4)
                .sorted()
                .forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        cars.stream().distinct().forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        cars.stream().skip(3).limit(3).forEach(System.out::println);

        System.out.println("-----------------------------------------------");

        List<String>srtingList = Arrays.asList("one","two","three","four", "five");
        srtingList.stream().skip(1).limit(2).forEach(System.out::println);


        System.out.println("-----------------------------------------------");

        System.out.println(srtingList.stream().filter(sl -> sl.length()>3)
                .count());



    }
}

