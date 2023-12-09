package cons;

public class Car {
    String brand;
    int year;
    static  int counterBrand;
    static  int counterYear;

    public Car(String brand, int year) {
        this.brand = brand;
        this.year = year;
        if (brand.equals("Volvo")){
            counterBrand++;
        }
        if (year == 2005){
            counterYear++;
        }
    }


}
