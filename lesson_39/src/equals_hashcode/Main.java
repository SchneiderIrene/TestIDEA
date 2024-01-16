package equals_hashcode;

public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(2, "order");
        Order order2 = new Order(2, "order");

        System.out.println(order1==order2);
        System.out.println(order1.equals(order2));



        String s1 = "Java";
        String s2 = "Hello";
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());

        System.out.println("--------------------");

        System.out.println(order1.hashCode());
        System.out.println(order2.hashCode());
    }
}
