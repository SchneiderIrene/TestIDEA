package pizza_shop;

public class OnlinePizzaShop {

PizzaChoice pizzaChoice = new PizzaChoice();
    Pizza order1 = pizzaChoice.order();

    public void orderPizza() {
        order1.prepare();
        order1.bake();
        order1.pack();
        System.out.println("Ваш заказ готов. Приятного аппетита");
    }
}
