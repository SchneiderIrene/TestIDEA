package cons;

import java.util.Arrays;
import java.util.function.Function;
import java.util.function.Predicate;

public class Main {

//    Написать метод, принимающий строку , содержащую слова, разделенные пробелом и два функциональных интерфейса -
//    function/unary operator и предикату. Метод должен предоставлять возможность реализации следующих действий:
//            1. При длине слова = 3 изменить все буквы этого слова на заглавные и вернуть измененную строку
//    1. При длине слова = 4 изменить все буквы этого слова на строчные и вернуть измененную строку
//    1. При длине слова = 5 изменить все буквы этого слова на звездочки и вернуть измененную строку
//    т.е. написать лямбду для каждого случая
//    public String transformer( String input, Predicate<?> predicate, Function<?,?>function)
//    aaa BBBB dDD eeEEe lll -> AAA BBBB DDD  eeEEe LLL
//    aaa BBBB dDD eeEEe lll -> aaa bbbb dDD eeEEe lll
//    aaa BBBB dDD eeEEe lll -> aaa BBBB dDD ***** lll
//
//            Протестировать

    public static void main(String[] args) {
        String input = "aaa BBBB dDD eeEEe lll";
        Predicate<String> predicate1 = i -> i.length()==3;
        Predicate<String> predicate2 = i -> i.length()==4;
        Predicate<String> predicate3 = i -> i.length()==5;

        Function<String, String> function1 = String::toUpperCase;
        Function<String, String> function2 = String::toLowerCase;
        Function<String, String> function3 = s -> "*****";

        System.out.println(transformer(input, predicate1, function1 ));

    }

    public static String transformer(String input, Predicate<String> predicate, Function<String, String>function){

        String[]words = input.split(" ");
        for (int i = 0; i<words.length; i++){
            if (predicate.test(words[i])){
              words[i] = function.apply(words[i]);
            }

        }

        return String.join(" ", words);


    }
}
