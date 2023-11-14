package lesson_6;

import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int a = scanner.nextInt();
        if (a>0){
            System.out.println("Number is positive");
        } else if (a<0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }

//        if (a>0){
//            System.out.println("Number is positive");
//        }
//        if (a<0) {
//            System.out.println("Number is negative");
//        }
//        if (a==0){
//            System.out.println("Number is zero");
//        } проверяет все условия, вариант выше прекращает работу после 1 совпадения
    }
}
