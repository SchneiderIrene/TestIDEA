package lesson_07;

import java.util.Scanner;

public class Switch_construction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int i = scanner.nextInt();

        switch (i){
            case  0:
                System.out.println("i is zero");
                break;

            case 1:
                System.out.println("i is one");
                break;

            case 2:
                System.out.println("i is two");
                break;

            case 3:
                System.out.println("i is three");
                break;

            default:
                System.out.println("i is not between 0 and 3");
        }
        System.out.println("After switch");

        char ch = 'a';
        switch (ch){
            case 'v':
                System.out.println("Case 'v'");
                break;

            case 'a':
                System.out.println("Case 'a'");
                break;

            case 'y':
                System.out.println("Case 'y'");
                break;

            default:
                System.out.println("no message");
        }
    }
}
