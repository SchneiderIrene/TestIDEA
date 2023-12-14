package practice;

public class Area {
    int i;

    public String area (int i){

        return String.format("%d",i*i);
    }

    @Override
    public String toString() {
        return  " has area of ";
    }
}

//    Геометрические фигуры
//    Используя свойства наследования написать программу для подсчета площади трех видов фигур -
//        круга, прямоугольника и квадрата.
//
//        Создать классы Circle, Rectangle, Square , содержащие соответствующие методы.
//        Затем в методе main создать маcсив из нескольких фигур и вывести на печать площади каждой фигуры и название ее
//        примерно в таком виде :
//        Circle has area of 100.0
//        Rectangle has area of 400.0
//        Square has area of 340.0
