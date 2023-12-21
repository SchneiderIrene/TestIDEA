package cons;

public class MethodIndex {
    public static void main(String[] args) {
        int[] ints = {1, 1, 1, 2, 7, 2, 3};
        //            3,2,7,3,1,1
        System.out.println(isIndex(ints));
        System.out.println(isIndex2(ints));
    }

    public static int isIndex(int[] ints) {

        int sum = 0;
        int leftSum = ints[0];
        int index;

        for (int i : ints) {
            sum += i;
            index = i;
            if (leftSum == sum - leftSum - index) {
                return index;
            }
        }

        return -1;
    }

    public static int isIndex2(int[] ints) {

        int sum = 0;
        int leftsum = 0;

        for (int i : ints) {
            sum += i;
        }
        for (int anInt : ints) {
            sum -= anInt;
            if (leftsum == sum) {
                return anInt;
            } else {
                leftsum += anInt;
            }
        }
        return -1;
    }
}
