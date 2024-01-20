package exceptions;

public class Main {
    public static void main(String[] args) {
        int n1 = 10;
        int n2 = 0;

        int[]ints = {1,2};

        try {

            System.out.println(ints[9]);

            System.out.println(n1/n2);


            String nullString = null;
            nullString.length();


        }

//        catch (ArrayIndexOutOfBoundsException e){
//            System.out.println("Index out of bounds !");
//            System.out.println(e.getMessage());
//        }
        catch (ArithmeticException e){
            System.out.println("Do not divide by zero");
            System.out.println(e.getMessage());
        }
        catch (NullPointerException e){
            System.out.println("NULL !!!");
            System.out.println(e.getMessage());
        }
        catch (Exception e){
            System.out.println("Exception is caught !");
            System.out.println(e.getMessage());
        }


        System.out.println();
        System.out.println("------------------");
        System.out.println("After catch block");



    }
}
