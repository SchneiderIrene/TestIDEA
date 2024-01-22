package cons;

import java.io.*;

public class MyScanner {

    public static void main(String[] args) {

        try(BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("formConsole.txt"))){

            String line;
            while (!(line = bufferedReader.readLine()).equalsIgnoreCase("EXIT")){
                bufferedWriter.write(line);
                bufferedWriter.newLine();
                bufferedWriter.flush();
            }

        }
        catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
