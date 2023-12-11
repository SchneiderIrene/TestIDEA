package cons;

public class Cycle {
    public static void main(String[] args) {
      String s1 = "abc";
      String s2 =  "cba";
        System.out.println(isCycle(s1,s2));

        System.out.println(isCycle2(s1,s2));


    }

    public static boolean isCycle (String s1, String s2){
        if (s1.length()!=s2.length()) {
            return false;
        }
        if (s1.isEmpty() || s1.equals(s2)){
            return true;
        }


        for (int i = 0; i<s1.length(); i++){
            if  (s1.equals(shifted(s2,i))){
                return true;
            }
        }
        return false;
    }

    private static String shifted(String s2, int shift) {
        return s2.substring(shift) + s2.substring (0, shift);
    }

    public static boolean isCycle2 (String s1, String s2){
        String str = s1.concat(s1);
        return str.contains(s2);
    }
}
