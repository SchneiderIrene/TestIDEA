package io_streams;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task {
    public static void main(String[] args) {
        File file = new File("people.txt");
        System.out.println(personList(file));

    }

    public static List<Person> personList(File file){

        List<Person>personList = new ArrayList<>();
        List<String>temp = new ArrayList<>();

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader(file))){

            String string;

            while ((string = bufferedReader.readLine()) != null){
                temp.add(string);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        for (String s: temp){
            String[]nameAge = s.split(",");
            int age = Integer.parseInt(nameAge[1].trim());

            if (age > 18){
                personList.add(new Person(nameAge[0].trim(), age));
            }
        }
        Collections.sort(personList);
        return personList;
    }
}
