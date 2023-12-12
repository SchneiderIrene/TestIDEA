import java.util.Arrays;

public class ArrayFibonacci {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(fibonacci(0)));
        System.out.println(Arrays.toString(fibonacci(1)));
        System.out.println(Arrays.toString(fibonacci(2)));
        System.out.println(Arrays.toString(fibonacci(3)));
        System.out.println(Arrays.toString(fibonacci(4)));
        System.out.println(Arrays.toString(fibonacci(5)));
        System.out.println(Arrays.toString(fibonacci(6)));
        System.out.println(Arrays.toString(fibonacci(7)));
        System.out.println(Arrays.toString(fibonacci(8)));
        System.out.println(Arrays.toString(fibonacci(9)));
    }
    public static int[] fibonacci (int n){
        int [] fibonacci = new int[n];

        if (n<2){
            return fibonacci;
        }

        fibonacci[0] = 0;
        fibonacci[1] = 1;

        for (int i = 2; i<n; ++i){
            fibonacci [i]= fibonacci[i-1] + fibonacci[i-2];
        }
        return fibonacci;
    }
}
