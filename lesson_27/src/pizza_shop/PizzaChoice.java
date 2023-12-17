package pizza_shop;


import java.util.Scanner;

public class PizzaChoice {
    static int i;
    static char k;
    static int numberOfOrders = 0;
    static Pizza [] pizzas = new Pizza[5];



    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (k != 'n'){

            System.out.println("Сделайте выбор: ");
            System.out.println("1. Margherita");
            System.out.println("2. Hawaii");
            System.out.println("3. Salami");
            System.out.println(".....................................");
            i = scanner.nextInt();
            System.out.println(choose(i));
            pizzas();
            System.out.println(".....................................");
            System.out.println("Хотите продолжить заказ?");
            System.out.println("y - Да");
            System.out.println("n - Нет");
            k = scanner.next().charAt(0);
            endChoose(k);

        }
        OnlinePizzaShop onlinePizzaShop = new OnlinePizzaShop();
        onlinePizzaShop.orderPizza();
//        System.out.println(Arrays.toString(pizzas(numberOfOrders)));
//        PizzaChoice pizzaChoice = new PizzaChoice();
//        System.out.println(Arrays.toString(pizzaChoice.orders()));

    }


    public static Pizza choose(int i) {

        switch (i) {
            case 1:
                return new Margherita("Pizza Margherita");
            case 2:
                return new Hawaii("Pizza Hawaii");
            case 3:
                return new Salami("Pizza Salami");
            default:
                System.err.println("Пожалуйста, выберите 1, 2 или 3");
                System.out.println(".....................................");
                return new Pizza("Pizza");
        }
    }
    public static Pizza[]pizzas(){
        pizzas[numberOfOrders++] = choose(i);
        return pizzas;
    }

    public static void endChoose(char k) {
        switch (k) {
            case 'y':
                break;
            case 'n':
                System.out.print("Спасибо! Ваш заказ ");
                for (Pizza p: pizzas){
                    System.out.print(" - " + p + " ");}
                System.out.println(" готовится. Ожидайте.");
                break;
            default:
                System.err.println("Вы ввели неправильный символ. Введите пожалуйста 'y' или 'n'");

        }
    }
    public  Pizza[] orders(){
        return pizzas();
    }

}
