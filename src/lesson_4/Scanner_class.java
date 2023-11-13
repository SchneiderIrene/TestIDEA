package lesson_4;

import java.util.Scanner;

import static java.lang.System.in;

public class Scanner_class {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        System.out.println("Введите имя");
        String name =  scanner.nextLine();
        System.out.println("Name ist " + name);

        System.out.println("Введите возраст");
        int age = scanner.nextInt();
        System.out.println("Age is "+age);


    }
}
