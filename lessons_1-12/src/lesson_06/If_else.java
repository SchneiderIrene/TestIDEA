package lesson_06;

public class If_else {
    public static void main(String[] args) {
    int number = 30;
    if (number<100){
        System.out.println("number is less 100");
        if (number>40){
            System.out.println("number is greater than 40");
        }
    }

    int x = 3;
    if ( x == 1){
        System.out.println("x = 1");
    } else if (x == 2) {
        System.out.println("x = 2");
    } else if (x == 3) {
        System.out.println("x = 3");
    }
    else if (x == 4) {
        System.out.println("x = 4");
    }
    else {
        System.out.println("x is not between 1 and 4");
    }
        System.out.println("if-else is finished");
    }
}
