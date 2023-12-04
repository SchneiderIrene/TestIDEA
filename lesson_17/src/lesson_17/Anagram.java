package lesson_17;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String string1 = "mamamoetramu";
        String string2 = "ramumoetmamy";
        System.out.println(anagram(string1, string2));


    }

    public static boolean anagram(String string1, String string2) {
        char[] arr1 = string1.toCharArray();
        Arrays.sort(arr1);
        System.out.println(Arrays.toString(arr1));

        char[] arr2 = string2.toCharArray();
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));

        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }
}

