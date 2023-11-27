package lesson_13;

public class Cons {
    public static void main(String[] args) {
        System.out.println(findPower(3,2));
        int arr [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumArr(arr));
    }
    public static int findPower (int num, int pow){
        int res = 1;
        for (int i = 1; i<=pow; i++){
            res *= num;
        }
        return res;
    }

    public static int sumArr (int [] arr){
        int index = 0;
        int sum = 0;
        for (int i = 0; i<=arr.length; i++){
            sum+=i;
        }
        return sum;
    }
}
