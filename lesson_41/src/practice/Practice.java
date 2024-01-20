package practice;

import java.util.*;

public class Practice {
    public static void main(String[] args) {
    List<String>list = List.of("Jack", "Jack", "Jack", "Ann", "Ann", "John", "John");
        System.out.println(removeDuplicate(list));



    }

    /*
    1.C  использованием множеств ( Set)  написать метод, который вернет лист без
    повторяющихся элементов
    Пример: { "John", "Mary", Peter, John, Ann, Mary} -> {John, Mary, Peter,Ann}
    List<String> removeDuplicates( List<String> input)
    */

    public static List<String> removeDuplicate(List<String> list){
        Set<String> set = new HashSet<>(list);
        return new ArrayList<>(set);
    }


}
