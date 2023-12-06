package cons;

public class Palidrom {

    public static void main(String[] args) {
        String s = "arozaypalanalapyazor";
        System.out.println(isPalidrom(s));
    }
        public static boolean isPalidrom (String s){
            char[]chars = s.toCharArray();
            String s2 = "";
            for (int i = chars.length-1; i>=0; i--) {
                s2+=chars[i];
                }
                    return s.equals(s2);
            }

        }

