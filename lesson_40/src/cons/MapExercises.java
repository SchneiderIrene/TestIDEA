package cons;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercises {
      /*
    Пусть есть массив строк( не пустой) . Нужно написать метод, принимающий этот массив и возвращающий мапу
    Map<String, Boolean>  где каждая строка массива является ключом, а значением является true  если строка в массиве
    встречается больше одного раза и false  если только один раз
    Примеры :
    ["a","b","a","c","b"] -> { "a" = true, "b" = true, "c" = false}
    ["a","b","c"] -> { "a" = false, "b" = false, "c" = false}
    ["c","c","c"] -> { "c" = true}
     */

    public static void main(String[] args) {
        String []strings1 = {"a","b","a","c","b"};
        String []strings2 = {"a","b","c"};
        String []strings3 = {"c","c","c"};

        System.out.println(mapStringBoolean(strings1));
        System.out.println(mapStringBoolean(strings2));
        System.out.println(mapStringBoolean(strings3));

    }

    public static Map <String, Boolean> mapStringBoolean (String[]strings){
        Map<String, Boolean> map = new HashMap<>();
        for (String s: strings){
            if (map.containsKey(s)){
                map.put(s, true);
            }
            else {
                map.put(s, false);
            }
        }
        return map;
    }

    public Map<String,Boolean> mapStringBoolean2(String[] strings){
        Map<String,Boolean> map = new HashMap<>();

        for(String s: strings){
            map.put(s,map.containsKey(s));
        }
        return map;
    }
}
