package lesson_11;

import java.util.Scanner;

public class Cons {
    public static void main(String[] args) {

        int res = calcSum();
        System.out.println(res);
    }

    public  static  int calcSum (){
        Scanner scanner = new Scanner(System.in);

        int sum = 0;
        int number;

        do{

            System.out.println("Input int number to add or 0 for exit");
            number = scanner.nextInt();
            sum = sum + number;
        }
        while (number!=0);
        return sum;
    }
}
