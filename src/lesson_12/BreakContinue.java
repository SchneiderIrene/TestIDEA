package lesson_12;

public class BreakContinue {
    public static void main(String[] args) {
        for (int i = 1; i<10; i++) {
            if (i==6){
                break;
            }
            System.out.println(i);
        }
        System.out.println("After for");


        for (int i = 1; i<10; i++) {
            if (i==6){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("After for");

        System.out.println();
        System.out.println();
        System.out.println("*********************************");
        System.out.println();

        int j = 0;
        while (j<10){

            if (j==6){
                j++;
                continue;
            }
            System.out.println(j);
            j++;
        }
    }
}
