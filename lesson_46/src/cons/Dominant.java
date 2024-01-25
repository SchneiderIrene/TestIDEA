package cons;

import java.util.HashMap;
import java.util.Map;

public class Dominant {
    public static void main(String[] args) {
        int[]ints = {7,7,6,7,6};
        System.out.println(findDominant(ints));
        System.out.println(findDominantMerge(ints));

    }
    /*
    Есть массив с положительными целыми числами. Написать метод, находящий такой элемент (если он есть)
    который встречается в массиве >lenght/2. Если такого нет, метод должен вернуть -1.
    При решении использовать мапу.
     */
    public static int findDominant (int[]ints){
        Map <Integer, Integer> map = new HashMap<>();


        for (int i = 0; i<ints.length; i++){
            if (map.containsKey(ints[i])){
                map.put((ints[i]), map.get(ints[i])+1);
            }
            else map.put(ints[i],1);
        }
        for (int key: map.keySet()){
            if (map.get(key)>ints.length/2){
                return key;
            }
        }
        return -1;
    }

    public static int findDominantMerge (int[]ints){
        Map <Integer, Integer> map = new HashMap<>();

        for (int i: ints){
           int res =  map.merge(i, 1, (olV, nV) -> olV +1);
           if(res > ints.length/2){
               return i;
           }
        }
        return -1;
    }
}
