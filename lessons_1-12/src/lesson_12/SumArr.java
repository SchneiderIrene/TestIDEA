package lesson_12;

public class SumArr {
    public static void main(String[] args) {
        int arr [] = {10,20,30,40,50};
        System.out.println(sumArr(arr));
    }

    public static int sumArr (int [] arr){
        int sum = 0;
        for (int i = 0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }
}
