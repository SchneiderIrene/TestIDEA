import java.util.Arrays;

public class String_methods {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "Hello";
        System.out.println(s1.length());
        System.out.println(s1.toCharArray()[0]);
        char [] arr = s1.toCharArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s1.concat(s2).concat(s1).concat(s2).concat(" ").concat("222"));
        System.out.println(String.join(" ",s1,s2));
        String s3 = "John";
        System.out.println(s3.charAt(1));
        System.out.println(s3.charAt(s3.length()-1));
        System.out.println(s3.charAt(0));
        System.out.println("With for cycle:");
        for (int i =0; i<s3.length();i++){
            System.out.print(s3.charAt(i));
        }
        System.out.println();

        String jack1 = "Jack";
        String jack2 = "Jack";
        String jack3 = new String("Jack");
        String jack4 = "jack";
        String jack5 = "JACK";

        System.out.println(jack1==jack2);
        System.out.println(jack1==jack3);
        System.out.println(jack1.equals(jack2));
        System.out.println(jack1.equals(jack3));
        System.out.println(jack1.equals(jack4));
        System.out.println(jack1.equalsIgnoreCase(jack5));

        String string1 = "hello";
        String string2 = "world";
        String string3 = "Hello";
        System.out.println(string1.compareTo(string2));
        System.out.println(string1.compareTo(string3));
        System.out.println(string1.indexOf('e'));
        System.out.println(string1.indexOf('l'));
        System.out.println(string1.lastIndexOf('l'));

        String string4 = "                Java             ";
        System.out.println(string4.trim() + string4.trim());

        String string5 = "Java                  is a great programming language";
        String[]worlds = string5.split(" ");
        System.out.println(Arrays.toString(worlds));

        String string6 = "George".substring(2);
        String string7 = "George".substring(0,3);
        System.out.println(string6);
        System.out.println(string7);

        String s = "George";
        System.out.println(halfString(s));


    }
    public static String halfString(String s){
        s = s.substring(0, s.length()/2);
        return s;
    }
}
