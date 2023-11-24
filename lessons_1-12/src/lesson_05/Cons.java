package lesson_05;

public class Cons {
    public static void main(String[] args) {
        /*
        weekday = день недели
        vacation = отпуск
        false false = true
        false true = true
        true false = false

         */

        boolean weekDay;
        boolean vocation;

        weekDay = true;
        vocation = false;

            System.out.println(!weekDay||vocation);
            System.out.println(weekDay==false||vocation);
            System.out.println(weekDay==false&&vocation);


    }
}
