package lesson_11;

public class MultiplicationTable {
    public static void main(String[] args) {
        printTable();
    }


    static void printTable(){
        int i = 1;
        while (i<=10){

            int j = 1;
            while (j<=10){
                System.out.println(i + " * " + j + " = " + j*i);
                j++;
            }
            System.out.println("********************************");
            i++;
        }
    }
}

