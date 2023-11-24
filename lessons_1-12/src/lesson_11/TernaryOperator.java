package lesson_11;

public class TernaryOperator {
    public static void main(String[] args) {
        int age = 10;
        if (age >= 18){
            System.out.println("Yes");
        }
        else {
            System.out.println("No");
        }

        boolean isAdult = age>=18?true:false;
        System.out.println(isAdult);

        String isAdultString = age>=18?"yes":"no";
        System.out.println(isAdultString);

        int num1 = - 15;
        int num2 = 30;
        int max = num1>=num2?num1:num2;
        System.out.println(max);

        int abs = num1>0?num1:-num1;
        System.out.println(abs);
    }
}
