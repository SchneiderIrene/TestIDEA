package cons;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String>names = new ArrayList<>();
        names.add("John");
        names.add("Jack");
        names.add("Bill");
        names.add("Ben");
        names.add("Ann");

        List<Integer>ints = new ArrayList<>();
        ints.add(2);
        ints.add(5);
        ints.add(18);
        ints.add(55);

        System.out.println(containsProduct(ints, 36));
        System.out.println(containsProduct2(ints, 40));

        System.out.println("----------------------------");

        System.out.println(withoutLength4(names));
        System.out.println(withoutLength4_2(names));
    }

    public static List<String> withoutLength4(List<String>names){
        Iterator<String>iterator = names.iterator();
        while (iterator.hasNext()){
            if (iterator.next().length() == 4){
                iterator.remove();
            }
        }
        return names;
    }

    public static List<String> withoutLength4_2(List<String>names){
       List<String>output = new ArrayList<>();
       for (String s: names){
            if (s.length() != 4) {
                output.add(s);
       }
        }
        return names;
    }

    public static boolean containsProduct (List<Integer> numbers, int product){
        for (int i = 0; i < numbers.size(); i++){
            for (int j = i+1; j < numbers.size(); j++){
                if(numbers.get(i)*numbers.get(j) == product){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean containsProduct2 (List<Integer> numbers, int product) {

        Collections.sort(numbers);
        int i = 0;
        int j = numbers.size()-1;
        while (j-i > 0){
            int mul = numbers.get(i)*numbers.get(j);
            if(mul<product){
                i++;
            }
            else if (mul>product){
                j--;
            }
            else return true;
        }
        return false;
    }
}
