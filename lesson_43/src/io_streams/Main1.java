package io_streams;

import java.io.*;

public class Main1 {
    public static void main(String[] args) {
       try(FileWriter writer = new FileWriter("output.txt", true)){
           String word = "Hello Java";
           writer.write(word);
           writer.append('\n');
           writer.append('!');

           writer.flush();
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }

       try(FileReader reader = new FileReader("output.txt")){
           int ch;
           while ((ch = reader.read())!= -1){
               System.out.print((char) ch);
           }
       }
       catch (IOException e){
           System.out.println(e.getMessage());
       }

        System.out.println();
        System.out.println("-------------------------------");

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("buffer.txt"))){
            String sentence = "Hello Java and everybody else";
            bufferedWriter.write(sentence);
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try(BufferedReader bufferedReader = new BufferedReader(new FileReader("buffer.txt"))){

            String str;
            while ((str = bufferedReader.readLine()) != null){
                System.out.println(str);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
