package lesson_12;

public class ForLoop {
    public static void main(String[] args) {
//    print10();
        System.out.println(sum(8));
        sumFor();
    }

    static void print10(){

        for(int i = 1; i<=10; i++){
            System.out.print(i + " ");
        }

        System.out.println();

        for(int i = 10; i>=1; i--){
            System.out.print(i + " ");
        }

        System.out.println();
        System.out.println();
        System.out.println("*********************************");
        System.out.println();

//        int i,j;
        for(int i = 1,  j = 10; i<=j; i++, j--){
            System.out.println(" i: " + i + " , j: " + j);
        }

        System.out.println();
        System.out.println();
        System.out.println("*********************************");
        System.out.println();

        for (int i = 0; i < 5;){
            System.out.print(i);
            i++;
        }

        System.out.println();
        System.out.println();
        System.out.println("*********************************");
        System.out.println();

        //for (;;){}
        //for()
    }
    static  int sum (int n){
        int res = 0;
        for (int i = 0; i<=n; i++){
            res += i;
        }
        return res;
    }

    static void sumFor (){
        int sum = 0;
        for (int i= 1; i<=15; sum+=i++); //как выше метод считает сумму всех чисел от 1 до 5
        System.out.println(sum);
    }


}