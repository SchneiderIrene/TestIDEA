package cons;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        File input = new File("person_input.txt");
        File output = new File("person_output.txt");
        readWrite(input, output);
    }

    public static void readWrite(File input, File output) {



        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(input));
             BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(output, false))) {

            String line;
            Map<String, Integer> result = new TreeMap<>();


            while ((line = bufferedReader.readLine()) != null) {
                String[] entry = line.split(",");
                String key = entry[0].trim().concat(" ").concat(entry[1].trim());
                int price = Integer.parseInt(entry[3].trim());
                int currentValue = result.getOrDefault(key, 0);
                int newValue = currentValue + price;

                result.put(key, newValue);
            }

            for (Map.Entry<String, Integer> me: result.entrySet()){
                bufferedWriter.write(me.getKey() + " " + me.getValue());
                bufferedWriter.newLine();
            }

        } catch (IOException e) {
            System.out.println(e.getMessage());
        }


    }

}


