package lesson_10;

import java.util.Scanner;

public class Cons {
    public static void main(String[] args) {

        sum();

    }

    public static void sum (){
        Scanner scanner = new Scanner(System.in);
        int num;
        int sumEven = 0;
        int sumOdd = 0;
        char counter = 'y';

        while (counter == 'y') {
            System.out.println("Enter number");
            num = scanner.nextInt();
            if (num%2==0){
                sumEven += num;

            }
            else {
                sumOdd +=  num;

            }
            System.out.println("Want you to enter another number? y/n");
            counter = scanner.next().charAt(0);

        }
        System.out.println("summa event = " + (sumEven));
        System.out.println("summa odd = " + (sumOdd));

    }
}
