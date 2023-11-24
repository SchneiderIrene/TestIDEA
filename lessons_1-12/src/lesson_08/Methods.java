package lesson_08;

public class Methods {
    public static void main(String[] args) {
        sum(3,5);
        sum(12345, 6789);
        System.out.println(sayHello("Iren"));
        helloWorld();
    }
    static void helloWorld (){
        System.out.println("Hello, World");
    }

    static int  sum (int a, int b){

        int c = a+b;
        System.out.println(c);
        return c;
    }

    static String sayHello (String name){

        return  "Hello, " + name + "!";
    }
}
