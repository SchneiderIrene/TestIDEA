package try_with_resources;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        FileInputStream fileInputStream1 = null;

        try {
            fileInputStream1 = new FileInputStream("text.txt");
            int i;
            while ((i=fileInputStream1.read())!= -1){
                System.out.println((char) i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
        finally {
            try {
                if(fileInputStream1 != null){
                    fileInputStream1.close();
                }
            }
            catch (IOException e){
                System.out.println(e.getMessage());
            }
        }


        System.out.println("--------------------");
        System.out.println("With try-with-resources");

        try(FileInputStream fileInputStream2 = new FileInputStream("text.txt")){
            int i;
            while ((i = fileInputStream2.read()) != -1){
                System.out.println((char) i);
            }
        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }


    }
}
