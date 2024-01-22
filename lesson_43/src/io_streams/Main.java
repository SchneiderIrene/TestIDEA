package io_streams;

import javax.imageio.IIOException;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("text.txt");
        System.out.println(file.exists());

        String string = "Hello Java";


        try   (FileOutputStream fileOutputStream = new FileOutputStream(file)){
                byte[]buffer = string.getBytes();
                fileOutputStream.write(buffer, 0, buffer.length);
            }

        catch (IOException e){
            System.out.println(e.getMessage());
        }

        try (FileInputStream fileInputStream = new FileInputStream(file)){
            int i;
            while ((i = fileInputStream.read())!=-1){
                System.out.print((char) i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

        System.out.println();
        System.out.println("-----------------------------------------------------");

        try (FileInputStream fileInputStream = new FileInputStream(file)){
            byte[]buffer = new  byte[512];

            int counter;
            while ((counter = fileInputStream.read(buffer))!= -1){
                for (int i = 0; i<counter; i++){
                    System.out.print((char) buffer[i]);
                }
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }

    }
}
