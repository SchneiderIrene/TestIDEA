package collectors;

import java.util.*;
import java.util.stream.Collectors;

public class OurColletors {

    public static void main(String[] args) {
        Car2 car2_1 = new Car2("BMW", 150000);
        Car2 car2_2 = new Car2("Mercedes", 200000);
        Car2 car2_3 = new Car2("Opel", 40000);

        List<Car2> car2List = Arrays.asList(car2_1, car2_2, car2_3);

        ArrayList<Car2> resCar = car2List.stream()
                .collect(Collectors.toCollection(ArrayList::new));


        List<String> nameList = Arrays.asList("John", "Bill", "Tim", "Jack", "Peter", "Benji");
        System.out.println(namesByLength(nameList));

        System.out.println("---------------------------");

        System.out.println(namesByLengthBoolean(nameList));

        System.out.println("---------------------------");

        System.out.println(convertToString(nameList));

    }


    public static Map<Integer, Set<String>> namesByLength(List<String>list){
        return list.stream()
                .collect(Collectors.groupingBy(String::length, Collectors.toSet()));
    }

    public  static Map<Boolean, List<String>> namesByLengthBoolean (List<String>list){
        return  list.stream()
                .collect(Collectors.partitioningBy(s -> s.length() >4));
    }

    public static String convertToString (List<String> stringList){
        return stringList.stream()
                .collect(Collectors.joining(", ", "Students ", " study Java"));
    }
}
