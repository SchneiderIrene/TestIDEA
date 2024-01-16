package equals_hashcode;

import java.util.Objects;

public class Order {
    private int id;
    private String name;

    public Order(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return id + ": " + name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof  Order)) return  false;

        Order order = (Order) o;
        return id == order.id && name.equals(order.name);
    }

//    @Override
//    public int hashCode() {
//        return id*name.hashCode();
//    }

   
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
