package lesson_12;

public class SumArr {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,5,6,7,8,9};
        System.out.println(sumArr(arr));
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
