package pizza_shop;


import java.util.Scanner;

public class PizzaChoice {
    static int i;
    static char k;


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        do {

            System.out.println("Сделайте выбор: ");
            System.out.println("1. Margherita");
            System.out.println("2. Hawaii");
            System.out.println("3. Salami");
            System.out.println(".....................................");
            i = scanner.nextInt();
            System.out.println(choose(i));


            System.out.println(".....................................");
            System.out.println("Хотите продолжить заказ?");
            System.out.println("y - Да");
            System.out.println("n - Нет");
            k = scanner.next().charAt(0);
            endChoose(k);

        }
        while (k != 'n');
        OnlinePizzaShop onlinePizzaShop = new OnlinePizzaShop();
        onlinePizzaShop.orderPizza();

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
                System.out.println("Пожалуйста, выберите 1, 2 или 3");
                System.out.println(".....................................");
                return new Pizza("Pizza");
        }
    }

    public static void endChoose(char k) {
        switch (k) {
            case 'y':
                break;
            case 'n':
                System.out.println("Спасибо! Ваш заказ готовится. Ожидайте.");
                break;
            default:
                System.out.println("Вы ввели неправильный символ, ваш заказ отменен. Попробуте еще раз");

        }
    }
    public  Pizza order(){
        return choose(i);
    }
}
