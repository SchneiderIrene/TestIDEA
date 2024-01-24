package built_in_interfaces;

import java.util.function.*;

public class Main {
    public static void main(String[] args) {
        /*
    Встроенные функциональные интерфейсы:

    Predicate<T> -  проверяет соблюдение некоторого условия. Если оно соблюдается,
    возвращает true
        boolean test(T t)
     */
        Predicate<Integer> isNegative = a -> a < 0;
        System.out.println(isNegative.test(3));
        System.out.println(isNegative.test(-3));

        // BinaryOperator<T> принимает два обьекта типа T  что-то с ними делает и возвращает рез-т типа T
        // T apply( T o1, T o2)
        BinaryOperator<Integer> plus = Integer::sum;
        System.out.println(plus.apply(1,2));

        //UnaryOperator<T>  принимает обьект типа T  , совершает с ним какие-то действия и возвращает  в виде
        // обьекта того же типа  T apply(T o1)
        UnaryOperator<Integer> square = a -> a*a;
        System.out.println(square.apply(2));

        BiFunction<Integer, Integer, String> concate = (a,b) -> Integer.toString(a) + b;
        System.out.println(concate.apply(3, 5));


        // Function<T,R> -  принимает тип T,  возвращает R
        Function<Integer, String> modify = i -> String.valueOf(i) + "yes";
        System.out.println(modify.apply(1));

        /*
        Consumer<T>
        void accept( T o)
         */
        Consumer<Integer> consumer1 = i -> System.out.println(i);
        consumer1.accept(999);

        Consumer<String> consumer2 = System.out::println;
        consumer2.accept("LLLL");

        /*
        Supplier<T> -  ничего не принимает, но возвращает обьект типа Т
        T get()
         */
        Supplier<String> stringSupplier = ()-> "Hello Java";
        System.out.println(stringSupplier.get());

    }
}
