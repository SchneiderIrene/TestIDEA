package lesson_15;

import java.util.Arrays;

public class Sort {
    public static void main(String[] args) {
         int []array = {3,77,56,45,99,35,7,3,8,9,4,6,1,9,7,41};
        System.out.println(Arrays.toString(array));
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        bubbleSort(array);
        System.out.println(Arrays.toString(array));

        int k = 10;
        var num = 34;
        var word = "John";
        int var = 45;


    }
    public static void bubbleSort (int[]array){
        boolean sorted = false;
        int temp;
        while (!sorted){
            sorted = true;
            for (int i = 0; i<array.length-1; i++){
                if (array[i]>array[i+1]){

                    temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                }
            }
        }
    }
}
