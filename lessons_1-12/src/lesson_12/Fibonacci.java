package lesson_12;

public class Fibonacci {
    public static void main(String[] args) {

        System.out.println(fibonacci(0));
        System.out.println("-----------------");
        System.out.println(fibonacci(1));
        System.out.println("-----------------");
        System.out.println(fibonacci(2));
        System.out.println("-----------------");
        System.out.println(fibonacci(3));
        System.out.println("-----------------");
        System.out.println(fibonacci(4));
        System.out.println("-----------------");
        System.out.println(fibonacci(5));
        System.out.println("-----------------");
        System.out.println(fibonacci(6));
        System.out.println("-----------------");
        System.out.println(fibonacci(7));
        System.out.println("-----------------");
        System.out.println(fibonacci(8));
        System.out.println("-----------------");
        System.out.println(fibonacci(9));
        System.out.println("-----------------");
    }
    public static int fibonacci (int n){
//        if (n==0) {
//            System.out.println(n);
//            return n;
//        }
//        else if (n==1) {
//            System.out.print(0 );
//            System.out.print(1);
//            return n;
//        }

        if (n<2){
            return n;
        }
        int a = 0;
        int b =1;
        int res = 0;

        for (int i = 2; i<=n; i++){
            res = a+b;
            a = b;
            b = res;
        }
        System.out.println();
        return res;
    }
}
