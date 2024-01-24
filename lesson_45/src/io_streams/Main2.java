package io_streams;

import java.util.Locale;

public class Main2 {
    public static void main(String[] args) {
        Concatable concatable1 = (a,b) ->  a + "" + b;
        System.out.println(concatable1.concat(3,5));

        Concatable concatable2 = (a, b) -> Integer.toString(a) + b;
        System.out.println(concatable2.concat(3,5));

        Checkable checkable1 = s -> s.length() == 3;
        System.out.println(checkable1.check("uuuuuuu"));

        Checkable checkable2 = s -> s.length()%2 == 0;
        System.out.println(checkable2.check("ppp"));

        Transformable transformable1 = string -> string.toUpperCase(Locale.ROOT);
        System.out.println(transformable1.modify("hhh jjj kkk lll"));

        Transformable transformable2 = string -> string.length()==4 ? "****" : string;
        System.out.println(transformable2.modify("llll"));
        System.out.println(transformable2.modify("ll"));





    }
}
