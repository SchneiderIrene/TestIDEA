package stream_api;

import javax.swing.text.html.Option;
import java.util.List;
import java.util.Optional;
import java.util.stream.Stream;

public class OurOptional {

    public static void main(String[] args) {

        List<Integer>integers = List.of(3,4,1,34,68,19);
        Optional<Integer> min = integers.stream().min(Integer::compare);
        System.out.println(min);
        System.out.println(min.get());


        Optional<Integer> max = integers.stream().max(Integer::compare);
        System.out.println(max);
        System.out.println(max.get());

        System.out.println("-----------------------------------------------");

        Optional<Integer> res = Stream.of(1,2,3,4,5).reduce((x, y) -> x*y);
        System.out.println(res.get());

        Optional<String> stringRes = Stream.of("Hello", "Java", "!!!")
                .reduce((str1, str2) -> str1 + " " + str2);
        System.out.println(stringRes.get());

        Optional<String> empty = Optional.empty();
        System.out.println(empty.isPresent());

        String name = "John";
        Optional<String>optJohn = Optional.of(name);
        System.out.println(optJohn.isPresent());

        optJohn.ifPresent(str -> System.out.println(str.length()));

        String nullName = null;
        nullName = "Jack";

        String kate = Optional.ofNullable(nullName).orElse("Kate");
        System.out.println(kate);

        Optional<String>word = Optional.of("Java");
        String hello = word.get();


        String anotherName = Optional.ofNullable(nullName).orElse("Kate");
        


    }
}
