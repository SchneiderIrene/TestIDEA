package exceptions;

import java.io.IOException;

public class MyException {
    public static void main(String[] args) {
        int[]nums = {4,8,16,32,64,128,256,512};
        int[]div = {2,0,4,8,0,8};

//        for (int i = 0; i<nums.length; i++){
//            try {
//                System.out.println(nums[i] + "/" + div[i] + " = " + nums[i]/div[i]);
//
//            }
//            catch (ArithmeticException exception){
//                System.out.println("Shouldn't divide by zero");
//
//            }
//            catch (ArrayIndexOutOfBoundsException exception){
//                System.out.println("The second array is finished and no elements left");
//
//            }
//            finally {
//                System.out.println("Java forever!!!");
//            }
//        }

        try {
            System.out.println(10/0);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }

        finally {
               System.out.println("Java forever!!!");
            }

        System.out.println("--------------------------");

//        printSmth();
//        checkCandidates(9, 20);
        try {
            method1(10);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public static int  printSmth () {
        try {
            System.out.println(10/2);
            return 10/2;
        }
        finally {
            System.out.println("Finally");
        }


    }

    public static void checkCandidates (int age, int weight){
        if (age < 10 && weight < 30){
            throw new ArithmeticException("Sorry, no");
        }
        else {
            System.out.println("Welcome");
        }
    }

    public static void method1 (int n) throws IOException, ClassNotFoundException{
        if (n==10){
            throw new IOException("IO Exception occurred");
        }
        else {
            throw  new ClassNotFoundException("Class not Found Exception");
        }
    }
}
