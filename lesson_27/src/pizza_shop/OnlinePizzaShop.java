package pizza_shop;

public class OnlinePizzaShop {

PizzaChoice pizzaChoice = new PizzaChoice();
    Pizza [] orders = pizzaChoice.orders();

    public void orderPizza() {

        for (int i = 0; i<orders.length-1; i++){
            orders[i].prepare();
            orders[i].bake();
            orders[i].pack();
        }
        System.out.print("Ваш заказ готов. Приятного аппетита!");
    }
}
