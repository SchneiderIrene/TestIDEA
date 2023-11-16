package lesson_07;

import java.util.Scanner;

public class HelpSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Our Help System. To see info enter menu number:");
        System.out.println("\t\t1. if");
        System.out.println("\t\t2. switch");

        int choice = scanner.nextInt();
        System.out.println("\n");

        switch (choice){
            case 1:
                System.out.println("IF:");
                System.out.println("if(condition) \n{statements}");
                System.out.println("else \n{statements}");
                break;

            case 2:
                System.out.println("SWITCH:");
                System.out.println("switch(expression) \n\t{case constant: \n\t\t\tstatements;\n\t\t\tbreak;}");
                System.out.println("\t\t\t.........");
                System.out.println("default: \n\t\t{statements}");
                break;

            default:
                System.out.println("Please enter 1 or 2");
        }

    }
}
