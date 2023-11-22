package lesson_12;

public class Cons {
    public static void main(String[] args) {
        System.out.println(trouble(true, 5));
        System.out.println(factorial(5));
        System.out.println(fibonacci(10));
    }
    static boolean trouble (boolean singing, int hour ){

        return singing&&(hour<7||hour>20);
    }

    static int factorial (int n){
        int f = 1;
        for ( int i = 1; i<=n; f*=i++);
        return f;
    }

    static int fibonacci (int n){
        int res = 0;
      for (int i = 0, j = 1; i<=n&&j<=n; i++, j++){
          res = i+j;
          System.out.print(res + " ");
      }
      return res;
    }
}
