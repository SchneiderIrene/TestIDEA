package lesson_14;

public class Demo {
    public static void main(String[] args) {
        int [] numbers = {7,9,2,0,23};
        int value = 9;
        boolean isFound = false;
        for (int el:numbers){
            if(el == value){
                isFound = true;
                break;
            }
        }
        if (isFound){
            System.out.println("The value is found");
        }
        int arr[] = {};
        System.out.println(findIndex(arr,0));

        System.out.println("-----------------------");

        int [] test = new int[10];
        for (int el: test){
            System.out.print(el);
        }
    }
    public static int findIndex (int[] arr, int n){
        if (arr.length==0){
            return -1;
        }
        for (int i = 0; i<arr.length; i++){
            if (arr[i]==n){
                return i;
            }
        }
        return -1;
    }


}
