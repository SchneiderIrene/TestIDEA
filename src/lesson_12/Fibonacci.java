package lesson_12;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibonacci(7));
    }
    static int fibonacci (int n){
        int res = 0;
        int a = 0;
        int b =1;
        for (int i = 0; i<n; i++){
            res = a+b;
            a = b;
            b = res;
            System.out.print(res + " ");
        }
        System.out.println();
        return res;
    }
}
