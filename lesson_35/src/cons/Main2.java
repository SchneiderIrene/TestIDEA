package cons;

import java.util.Scanner;

public class Main2 {

//    Пользователь вводит информацию об автомобиле с клавиатуры в следующем виде : audi@2024@red
//    Нужно получить элементы этой строки и вывести информацию на печать  в таком виде:
//    Саr: audi  Production year: 2024 Colour: red
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter Car in format 'CarMake@year@color' ");
    String  s = scanner.nextLine();

    int counter = 0;
    for (int i = 0; i<s.length(); i++){
        if (s.charAt(i) == '@'){
            counter++;
        }
    }
    if (counter!=2){
        System.err.println("You used false format.");
        return;
    }

    printCar(s);


}

 public static void printCar(String s){

    String[]strings = s.split("@");
     String name = "";
     String year = "";
     String color = "";
    for (String ignored : strings){
        name = strings[0];
        year = strings[1];
        color = strings[2];
    }
     System.out.println("Car: " + name);
     System.out.println("year: " + year);
     System.out.println("color: " + color);

 }


}
