package lambda_expressions;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int height = 100;
        Flyable flyable = new Flyable() {
            public void fly() {
                System.out.println("Flying at " + height);
            }
        };
        flyable.fly();

        Flyable fLambda = () -> System.out.println("Flying with Lambda at " + height);
        fLambda.fly();

        Flyable fLambda1 = () -> System.out.println("Flying with Lambda1 at " + height);
        fLambda1.fly();

        System.out.println("-----------------------------------------");

        Walkable walkable = () -> "Walking with Lambda";
        System.out.println(walkable.walk());

        System.out.println("-----------------------------------------");

        Eatable eatable1 = (String food) -> "I eat " + food;
        System.out.println(eatable1.eat("Food"));

        Eatable eatable2 = food -> "A man eat " + food;
        System.out.println(eatable2.eat("Food"));

        System.out.println("-----------------------------------------");

        Arithmetical arithmetical1 = (x,y) -> x+y;
        System.out.println(arithmetical1.calculate(1,2));

        Arithmetical arithmetical2 = (x,y) -> x-y;
        System.out.println(arithmetical2.calculate(1,2));

        Arithmetical arithmetical3 = (x,y) -> x/y;
        System.out.println(arithmetical3.calculate(1,2));

        Arithmetical arithmetical4 = (x,y) -> x*y;
        System.out.println(arithmetical4.calculate(1,2));


        System.out.println("-----------------------------------------");

        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Ann");
        names.add("Jack");
        names.add("Bill");

        names.forEach(name -> System.out.println(name));


        System.out.println("-----------------------------------------");

        List<Product>items = new ArrayList<>();
        items.add(new Product("Keyboard", 25));
        items.add(new Product("TV", 500));
        items.add(new Product("Laptop", 3300));

        Collections.sort(items, (p1,p2) -> p1.getName().compareTo(p2.getName()));
        System.out.println(items);

        Collections.sort(items, (p1,p2) -> p1.getPrice() - p2.getPrice());
        System.out.println(items);
    }


}
