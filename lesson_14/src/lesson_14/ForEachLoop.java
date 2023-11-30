package lesson_14;

public class ForEachLoop {
    public static void main(String[] args) {

        int [] arr = {10,20,30,40,50};

        System.out.println(sumArr(arr));


        int sum = 0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);

        sum = 0;
        for (int x : arr){
            sum+=x;
        }
        System.out.println(sum);
    }

    public static int sumArr (int [] arr){
        int sum = 0;
        for (int j : arr) {
            sum += j;
        }
        return sum;
    }
}
