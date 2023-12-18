package pizza_shop;


import java.util.Scanner;

public class PizzaChoice {
    static String i;
    static int limit = 10;
    static int counter = 0;
    static Pizza [] pizzas = new Pizza[limit];



    public static void main(String[] args) {
        PizzaChoice pizzaChoice = new PizzaChoice();
        Scanner scanner = new Scanner(System.in);
        do{

            System.out.println("Сделайте выбор: ");
            System.out.println("1. Margherita");
            System.out.println("2. Hawaii");
            System.out.println("3. Salami");
            System.out.println(".....................................");
            i = scanner.nextLine();

            Pizza newPizza = choose(i);
            while (newPizza==null){
                System.out.println("You have the wrong choice. Please  choose pizza: 1 - Margarita, 2 - Hawaii, 3 - Salami");
                i = scanner.nextLine();
                newPizza = choose(i);
            }
            pizzas();
        }
        while (!scanner.nextLine().equalsIgnoreCase("n"));
            System.out.print("Спасибо! Ваш заказ ");
            for (int i = 0; i<counter; i++){
                System.out.print(pizzas[i] + " ");
            }
            System.out.println();
            System.out.println("And we are making them ready for you now: ");
            for (int i = 0; i<counter; i++){
                pizzas[i].orderPizza();
            }
        System.out.println("Ваш заказ готов. Приятного аппетита!");




    }


    public static Pizza choose(String i) {

        switch (i) {
            case "1":
                return new Margherita("Pizza Margherita");
            case "2":
                return new Hawaii("Pizza Hawaii");
            case "3":
                return new Salami("Pizza Salami");
            default:
                System.err.println("Пожалуйста, выберите 1, 2 или 3");
                System.out.println(".....................................");
                return null;
        }
    }
    public static Pizza[]pizzas(){
        if (counter<limit){
            pizzas[counter++] = choose(i);
            System.out.println(".....................................");
            System.out.println("Хотите продолжить заказ?");
            System.out.println("n - Нет");
            System.out.println("Press any other key to order another pizza");
        }
        else {
            System.out.println("You have reached maximum amount of pizzas for this order.");
            return null;
        }
        return pizzas;
    }




}
