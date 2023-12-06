package cons;

public class Caesar {
    int n;

    public Caesar(int n) {
        this.n = n;
    }

    public String code (String word){
        String code = "";
        int lastChar = 'z';
        int length = 'z' - 'a'+1;
        for (char c: word.toCharArray()){
            int chNoRotation = c +n;
            int chVal = chNoRotation<=lastChar ? chNoRotation : chNoRotation-length;
            code+=(char)chVal;
        }
        return code;
    }

    public static void main(String[] args) {
        Caesar c1 = new Caesar(2);
        System.out.println(c1.code("z"));

    }
    }

