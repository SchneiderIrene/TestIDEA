package lesson_14;

public class ArrArr {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int[] arr2 = {1,2,7};
        System.out.println(equalArrays(arr1, arr2) ? " равны " : "не равны");

    }
    public static boolean equalArrays (int[] arr1, int[] arr2){
        if (arr1.length!=arr2.length) {
            return false;
        }
            for (int i = 0; i<arr1.length; i++){
                if (arr1[i]!=arr2[i]) {
                    return false;
                }
            }
        return true;
        }
    }

