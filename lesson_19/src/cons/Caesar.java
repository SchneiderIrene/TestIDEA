package cons;

public class Caesar {
    int n;

    public Caesar(int n) {
        this.n = n;
    }

    public String code (String word){
        String code = "";
        char[] arr1 = word.toCharArray();
        for (int i = 0; i<arr1.length; i++){
           arr1[i] += (char) n;
            code += arr1[i];
        }
        return code;
    }
    }

