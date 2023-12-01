package lesson_17;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {
        String string = "abujfvolkfdswcd";
        System.out.println(startString(string));

        String s = "abab";
        System.out.println(unic(s));

    }

    public static String startString(String string) {
        return string.substring(string.length() - 1).concat(string.substring(0, string.length() - 1));
    }

    public static String unic(String s) {
        char[] arr = s.toCharArray();
        String res = "";
        for (char c : arr) {

            if (res.indexOf(c) == -1) {
                res = res + c;
            }
        }
        return res;
    }


}
