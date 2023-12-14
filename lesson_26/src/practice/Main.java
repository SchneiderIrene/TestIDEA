package practice;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    Area circle = new Circle();
    Area rectangle = new Rectangle(8);
    Area square = new Square();


        Area []areas = {circle, rectangle, square};

        for (Area area: areas){
//            System.out.print(area + " has area of ");
            System.out.println(area + area.area(9));
        }

    }

}
