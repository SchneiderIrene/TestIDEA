package lesson_15;

import java.util.Arrays;

public class Cons {
    public static void main(String[] args) {
    int [] numbers = {76,90,12,6,987,34,1,-23};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        Sort.bubbleSort(numbers);
        System.out.println(abc(numbers));
    }
    public static boolean abc (int [] array) {

        for (int el: array){
            if (el==0 || el==-1){
                return false;
            }
        }
    return true;
    }
}
