package pizza_project;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int limit = 4;
        Pizza[]pizzaArray = new Pizza[limit];
        int counter = 0;

        Scanner scanner = new Scanner(System.in);
        PizzaChoice choiceClass = new PizzaChoice();
        do {
            System.out.println("Hi, choose pizza: 1 - Margarita, 2 - Hawaii, 3 - Salami");
            String pizzaChoice = scanner.nextLine();

            Pizza newPizza = choiceClass.choosePizza(pizzaChoice);
            while (newPizza == null){
                System.out.println("You have the wrong choice. Please  choose pizza: 1 - Margarita, 2 - Hawaii, 3 - Salami");
                pizzaChoice = scanner.nextLine();
                newPizza = choiceClass.choosePizza(pizzaChoice);
            }

           // newPizza.orderPizza();
            if (counter < limit){
                pizzaArray[counter++] = newPizza;
                System.out.println("Do you want to order another pizza? Enter 'no' if not or" +
                        "press any other key to order another pizza");
            }
            else {
                System.out.println("You have reached maximum amount of pizzas for this order.");
                break;
            }
        }
        while (!scanner.nextLine().equalsIgnoreCase("no"));
        System.out.println("Thank you for your order! Here is the list of your pizzas: ");
        for (int i = 0; i<counter; i++){
            System.out.println(pizzaArray[i].getType());
        }
        System.out.println("And we are making them ready for you now: ");
        for (int i = 0; i<counter; i++){
            pizzaArray[i].orderPizza();
        }

    }
}
