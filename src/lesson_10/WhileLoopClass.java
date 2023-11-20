package lesson_10;

public class WhileLoopClass {
    public static void main(String[] args) {
        int i = 1;
        while (i<=6) {
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }

        char ch = 79;
        while (ch<=122){
            System.out.print(ch+" ");

            ch++;
        }
        System.out.println();


        System.out.println(sumNum(100));
    }
    public static int sumNum (int n){
        int i = 1;
        int sum = 0;
        while (i<=n){
            sum = sum+i;
            i++;
        }
        return sum;
    }
}
