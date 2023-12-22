package cons;

public class MethodIndex {
    public static void main(String[] args) {
        int[] ints = {1, 2, 2, 7, 2, 3, 9};

        System.out.println(isIndex(ints));
        System.out.println(isIndex2(ints));
    }

    public static int isIndex(int[] ints) {

        int sum = 0;
        int leftSum = ints[0];
        int lastIndex = ints.length-2;
        int index = 0;

        for (int anInt : ints) {
            sum += anInt;
        }
            for (int i = 1; i<=lastIndex; i++) {
                int cur = ints[i];
            if (leftSum == sum - leftSum - cur) {
                index = i;
               break;
            }
                leftSum+=cur;
        }

        return index;
    }

    public static int isIndex2(int[] ints) {

        int sum = 0;
        int leftsum = 0;

        for (int i : ints) {
            sum += i;
        }
        for (int i =0; i<ints.length; i++) {
            sum -= ints[i];
            if (leftsum == sum) {
                return i;
            } else {
                leftsum += ints[i];
            }
        }
        return -1;
    }
}
