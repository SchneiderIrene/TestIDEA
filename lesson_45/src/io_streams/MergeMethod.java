package io_streams;

import java.util.HashMap;
import java.util.Map;

public class MergeMethod {
    public static void main(String[] args) {
        Map <String, Integer> items = new HashMap<>();
        items.put("Desktop", 1000);
        items.put("TV", 600);
        items.put("Mouse", 30);

        System.out.println(items);

        items.merge("Phone", 50, (oldValue, newValue)-> oldValue+newValue);
        System.out.println(items);

        items.merge("TV", 3050, Integer::sum);
        System.out.println(items);

        items.merge("Desktop", 500, (oldValue, newValue)-> newValue);
        System.out.println(items);

        Map <String, String> cities = new HashMap<>();
        cities.put("Berlin", "Germany");
        cities.put("Paris", "France");
        cities.put("London", "England");

        System.out.println(cities);

        cities.merge("London", "Great Britain", (oV, nV) -> oV + "/" + nV);
        System.out.println(cities);

        cities.merge("Madrid", "Spain", (oV, nV) -> oV + "/" + nV);
        System.out.println(cities);

        cities.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));

        Map<String, Integer> items1 = new HashMap<>();
        items1.put("Desktop", 600);
        items1.put("Mouse", 100);

        Map<String, Integer> items2 = new HashMap<>();
        items2.put("TV", 800);
        items2.put("Mouse", 150);

        items2.forEach((key, value) -> items1.merge(key, value, (oV, nV) -> {
            if (oV<nV){
                return oV;
            }
            else return nV;
        }));


        items1.forEach((key, value) -> System.out.println("key: " + key + ", value: " + value));


    }
}
