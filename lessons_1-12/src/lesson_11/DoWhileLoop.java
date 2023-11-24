package lesson_11;

import java.util.Scanner;

public class DoWhileLoop {
    public static void main(String[] args) {
        int i = 30;

        do {
            System.out.print(i + " ");
            i--;
        }
        while (i > 1);
        System.out.println();
        example();
    }

    static void example() {
        Scanner scanner = new Scanner(System.in);
        char ch;

        do {
            System.out.println("Enter letter/q to quit");
            ch = scanner.next().charAt(0);
            System.out.println("You have entered " + ch);
        }
        while (ch != 'q');
    }
}
