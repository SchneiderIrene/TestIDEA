package stringBuilder;

public class Main {

    public static void main(String[] args) {
        String a = "hello";
        a = "Java";

        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder("Hello");
        System.out.println(sb2);


        sb2.append(" Java");
        System.out.println(sb2);
        sb2.append(" !").append(12345);
        System.out.println(sb2);

        System.out.println(sb2.reverse());

        sb2.insert(1,"AAA");
        System.out.println(sb2);
    }
}
