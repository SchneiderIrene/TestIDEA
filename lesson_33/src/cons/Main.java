package cons;

public class Main {
    public static void main(String[] args) {
        String string = "qwertyuiop";
        System.out.println(areUnique(string));
        System.out.println(areUnique2(string));
    }

    public static boolean areUnique ( String string){
        for (int i = 0; i<string.length()-1; i++){
            char ch = string.charAt(i);
            for (int j = i+1; j<string.length(); j++){
                if (ch == string.charAt(j)){
                    return false;
                }
            }

        }
        return true;
    }

    public static boolean areUnique2 (String string){
        for (int i = 0; i<string.length(); i++){
            char ch = string.charAt(i);
            if(string.indexOf(ch)!=string.lastIndexOf(ch)){
                return false;
            }
        }
        return true;
    }
}
