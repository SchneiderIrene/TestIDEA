package stream_api;

import javax.swing.text.html.Option;
import java.util.Optional;

public class OurOptional {

    public static void main(String[] args) {
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
