package cons;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Girl girl1 = new Girl( "Maria", "Ivanova", 13, "f");
        System.out.print(girl1.name + " ");
        System.out.print(girl1.surname + " ");
        System.out.print(girl1.age + " ");
        System.out.print(girl1.sex + " - " );
        girl1.work();
        System.out.println(girl1);

        System.out.println("--------------------------------------");

        Boy boy1 = new Boy("Vasiliy", "Petrov", 14, "m");
        System.out.print(boy1.name + " ");
        System.out.print(boy1.surname + " ");
        System.out.print(boy1.age + " ");
        System.out.print(boy1.sex + " - " );
        boy1.work();
        System.out.println(boy1);

        System.out.println("--------------------------------------");

        Schooler []schoolers = new Schooler[]{girl1,boy1};
        System.out.println(Arrays.toString(schoolers));
        System.out.println("--------------------------------------");
        for (Schooler schooler: schoolers){
            System.out.println(schooler);
        }
    }
}
