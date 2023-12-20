package cons;

public class cons {
    public static void main(String[] args) {
        String s = "Java hello";
        char ch = 'l';
        System.out.println(removeCharacter(s, ch));
        System.out.println(removeCharacter2(s, ch));


    }

    public static String removeCharacter(String s, char ch) {
        StringBuilder sb = new StringBuilder(s);
        return sb.deleteCharAt(s.indexOf(ch)).toString();
    }

    public static String removeCharacter2(String s, char ch) {
        if (s == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != ch) {
                sb.append(s.charAt(i));
            }
        }
        return sb.toString();
    }





}
