package lesson_7;

public class Cons {
    public static void main(String[] args) {
        boolean johnSmile = true;
        boolean piterSmile = false;

        boolean result;
        System.out.println(!(johnSmile^piterSmile)||(johnSmile==piterSmile));
        System.out.println(!(johnSmile^piterSmile));
        System.out.println(johnSmile==piterSmile);
        System.out.println(johnSmile&&piterSmile||(!johnSmile && !piterSmile));

        }
    }

