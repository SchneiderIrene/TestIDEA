package work_project_abstract;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Girl girl1 = new Girl( "Maria", "Ivanova", 13, "f");
        Girl girl2 = new Girl( "Katy", "Chernoff", 14, "f");



        Boy boy1 = new Boy("Vasiliy", "Petrov", 14, "m");
        Boy boy2 = new Boy("Victor", "Smirnoff", 13, "m");

        Schooler[]schoolers = {girl1, girl2, boy1, boy2};

        for (Schooler schooler: schoolers){
            System.out.println(schooler);
           schooler.work();
        }
    }
}
