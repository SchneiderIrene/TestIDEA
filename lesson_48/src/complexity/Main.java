package complexity;

public class Main {
    public static void main(String[] args) {

    }

    public static int findMaxEl (int [] ints, int n){
        int max = ints[0];

        for (int i = 0;i < n; i++){
            if(ints[i]>max){
                max = ints[i];
            }
        }
        return max;
    }
}
