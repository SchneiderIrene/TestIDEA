package lesson_14;

public class Cons {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println(a);
        System.out.println(b);


        String[]strings = {
                "Hello World",
                "Hallo Java world",
                "Jack",
                "Hello John",
                "John",
                "That is it"
        };
        printStringWithLength(strings, 8);
    }
    public static void printStringWithLength (String[]strings, int length){

//        int counter = 0;
        boolean flag = false;

        for (String s: strings){
            if (s.length() == length) {
                System.out.println(s);
                flag = true;
            }
        }
        if (flag==false){
            System.out.println("no");
        }
    }
}
