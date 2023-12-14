package cons;

import java.util.Arrays;

    public class ArrayFibonacci {
        public static void main(String[] args) {

            System.out.println(Arrays.toString(fibonacciArray(0)));
            System.out.println(Arrays.toString(fibonacciArray(1)));
            System.out.println(Arrays.toString(fibonacciArray(2)));
            System.out.println(Arrays.toString(fibonacciArray(3)));
            System.out.println(Arrays.toString(fibonacciArray(4)));
            System.out.println(Arrays.toString(fibonacciArray(5)));
            System.out.println(Arrays.toString(fibonacciArray(6)));
            System.out.println(Arrays.toString(fibonacciArray(7)));
            System.out.println(Arrays.toString(fibonacciArray(8)));
            System.out.println(Arrays.toString(fibonacciArray(9)));

            System.out.print(fibonacci(0) + "  ");
            System.out.print(fibonacci(1) + "  ");
            System.out.print(fibonacci(2) + "  ");
            System.out.print(fibonacci(3) + "  ");
            System.out.print(fibonacci(4) + "  ");
            System.out.print(fibonacci(5) + "  ");
            System.out.print(fibonacci(6) + "  ");
            System.out.print(fibonacci(7) + "  ");
            System.out.print(fibonacci(8) + "  ");
            System.out.print(fibonacci(9) + "  ");

        }
        public static int[] fibonacciArray(int n){
            int [] fibonacci = new int[n];

            if (n<2){
                return  fibonacci;
            }

            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i<n; i++){
                fibonacci [i]= fibonacci[i-1] + fibonacci[i-2];
            }
            return fibonacci;
        }

        public static int fibonacci (int n){
            int [] fibonacci = new int[n];
            if (n<2){
                return n;
            }

            fibonacci[0] = 0;
            fibonacci[1] = 1;

            for (int i = 2; i<n; i++){
                fibonacci [i] = fibonacci[i-1] + fibonacci[i-2];
            }
            return fibonacci[n-1];
        }
    }

