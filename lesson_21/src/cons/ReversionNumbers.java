package cons;

public class ReversionNumbers {
    public static void main(String[] args) {
        int a = 365;
        System.out.print(a/100 + " ");
        System.out.print(a/10%10 + " ");
        System.out.println(a%10);

        System.out.print(a%10);
        System.out.print((a/10%10));
        System.out.print(a/100);
    }
}

//Дано трехзначное число. Используя только арифметические операции,
// вывести на печать все цифры этого числа и также новое число, образованное
//        перестановкой  единиц и сотен
//        365
//        3 , 6, 5  563

