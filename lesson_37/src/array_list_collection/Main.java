package array_list_collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> nameArrayList = new ArrayList<>();
        List<String> nameList = new ArrayList<>();

        nameList.add("Cersei Lannister");
        nameList.add("Tyrion Lannister");
        nameList.add("Jaime Lannister");
        nameList.add(1, "John Snow");
        System.out.println(nameList);
        nameList.set(0, "Daineris Targarien");
        System.out.println(nameList);
        System.out.println(nameList.get(0));
        System.out.println(nameList.get(nameList.size()-1));
        for (String string : nameList) {
            System.out.println(string);
        }
        nameList.remove("Jaime Lannister");
        System.out.println(nameList);
        nameList.remove(2);
        System.out.println(nameList);

        nameList.add(null);
        System.out.println(nameList);
        System.out.println(nameList.remove(2));

        System.out.println(nameList.indexOf("Daineris Targarien"));
        System.out.println(nameList.contains("hghggh"));
        System.out.println(nameList.contains("Daineris Targarien"));

        Collections.sort(nameList);
        System.out.println(nameList);


    }


}
