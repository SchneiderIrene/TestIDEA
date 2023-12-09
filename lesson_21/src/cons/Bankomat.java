package cons;

public class Bankomat {
    public static void main(String[] args) {
        System.out.println(bank(5));

    }
   public static int bank (int n){
    int res = n/10;
    res += (n%10)/5;
    res += (n%10)%5;

       return res;
   }

}

