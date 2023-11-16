package lesson_06;

public class DigitsInNumber {
    public static void main(String[] args) {
        int i = 1;
        if (i < 10 && i>=1){
            System.out.println("It is a one digit number");
        } else if (i<100 && i>=10) {
            System.out.println("It is a two digit number");
        } else if (i<1000 && i>=100) {
            System.out.println("It is a three digit number");
        }
        else {
            System.out.println("Number has a more than 3 digits");
        }

    }
}
