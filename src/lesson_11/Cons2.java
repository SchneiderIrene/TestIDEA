package lesson_11;

import java.util.Scanner;

public class Cons2 {
    public static void main(String[] args) {
    printNumbers();
    }

    public static void printNumbers (){
        Scanner scanner = new Scanner(System.in);

        int number = 0;
        do{
            System.out.println("Input int number to add or 0 for exit");
            number = scanner.nextInt();

            int counter = 0;
            while (counter<=number){
                System.out.print(" " + counter);
                counter++;
            }
            System.out.println();
        }while (number!=0);
    }
}
