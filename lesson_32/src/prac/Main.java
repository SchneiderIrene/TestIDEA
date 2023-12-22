package prac;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        String string = "aaa BBBB dEF cFRgh bbb";


        Word word1 = new Word();
        WordChecker wordChecker1 = new ToUpperCaseChecker();
        WordChecker wordChecker2 = new ToLowerCaseChecker();
        WordChecker wordChecker3 = new StarChecker();

        System.out.println(Arrays.toString(word1.letterReplace(string)));
        System.out.println(string);
        System.out.println(word1.transform(string,wordChecker1));
        System.out.println(word1.transform(string,wordChecker2));
        System.out.println(word1.transform(string,wordChecker3));
    }

}
