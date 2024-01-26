package stream_api;

public class Car2 {
   private String brand;
    private int price;

    public Car2(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car2{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}
