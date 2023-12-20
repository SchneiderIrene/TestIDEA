package cons;

public class NumberOfLetters {
    public static void main(String[] args) {
        String string = "aaaabbbbbccccd";

        System.out.println(numberOfLetter(string));
    }

    public static String numberOfLetter(String string) {

        if (string == null) {
            return "";
        }

        StringBuilder stringBuilder = new StringBuilder();
        int counter = 1;

        for (int i = 0; i < string.length()-1; i++) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                counter++;
            } else {
                stringBuilder.append(counter).append(string.charAt(i));
                counter = 1;
            }
        }
        if (counter > 1) {
            stringBuilder.append(counter);
        }
        stringBuilder.append(string.charAt(string.length()-1));

        return stringBuilder.toString();
    }
}
