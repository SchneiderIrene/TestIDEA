package stream_api;

import java.util.*;
import java.util.stream.Collectors;
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
                .limit(4)
                .forEach(System.out::println);

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
        names.filter(n -> n.length()==4)
                .forEach(System.out::println);

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

        System.out.println("-----------------------------------------------");

        List <String> list = Arrays.asList("one","two","three","four", "five");
        Optional <String> first = list.stream().findFirst();
        System.out.println(first.get());

        System.out.println("-----------------------------------------------");

        Optional <String> any = list.stream().findAny();
        System.out.println(any.get());

        System.out.println("-----------------------------------------------");

        List<String> nameList = Arrays.asList("Jack", "John", "Ann", "Vladislav");
        boolean allEl = nameList.stream().allMatch(string -> string.length()>2);
        System.out.println(allEl);

        System.out.println("-----------------------------------------------");

        boolean anyEl = nameList.stream().anyMatch(string -> string.length()>7);
        System.out.println(anyEl);

        System.out.println("-----------------------------------------------");

        boolean nonEl = nameList.stream().noneMatch(string -> string.equals("Tim"));
        nonEl = nameList.stream().noneMatch(string -> string.equals("Ann"));
        System.out.println(nonEl);

        System.out.println("-----------------------------------------------");

        List<Integer>integers = List.of(3,4,1,34,68,19);
        Optional<Integer> min = integers.stream().min(Integer::compare);
        System.out.println(min);
        System.out.println(min.get());


        Optional<Integer> max = integers.stream().max(Integer::compare);
        System.out.println(max);
        System.out.println(max.get());

        System.out.println("-----------------------------------------------");

        Optional<Integer> res = Stream.of(1,2,3,4,5).reduce((x,y) -> x*y);
        System.out.println(res.get());

        Optional<String> stringRes = Stream.of("Hello", "Java", "!!!")
                .reduce((str1, str2) -> str1 + " " + str2);
        System.out.println(stringRes.get());

        System.out.println("-----------------------------------------------");

       int result =  Stream.of(1,2,3,4,5).reduce(2, (a,b) -> a*b);
        System.out.println(result);


        System.out.println("-----------------------------------------------");


        List <String> carsList = new  ArrayList<>();
        carsList.add("Volvo");
        carsList.add("Mercedes");
        carsList.add("BMW");
        carsList.add("Opel");
        carsList.add("Ford");

       List<String> carsFilter = carsList.stream()
                .filter(car -> car.length()>3)
                .collect(Collectors.toList());

        System.out.println(carsFilter);

        System.out.println("-----------------------------------------------");

        Set <String> carsSet  = carsList
                .stream()
                .filter(car -> car.length()>3)
                .collect(Collectors.toSet());

        System.out.println(carsSet);

        System.out.println("-----------------------------------------------");

        Car2 car2_1 = new Car2 ("BMW", 150000);
        Car2 car2_2 = new Car2 ("Mercedes", 200000);
        Car2 car2_3 = new Car2 ("Opel", 40000);

        List<Car2> car2List = Arrays.asList(car2_1, car2_2, car2_3);
        Map<String, Integer> carMap = car2List.stream()
                .collect(Collectors.toMap(Car2::getBrand, Car2::getPrice));

        carMap.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));
        System.out.println(carMap);

        System.out.println("-----------------------------------------------");


        String s1 = "123456";
        String s2 = "fhfhghgfhg";
        System.out.println(isNumber(s1));
        System.out.println(isNumber(s2));


    }

    public static boolean isNumber(String s){
        return s.chars().allMatch(Character::isDigit);
    }
}

