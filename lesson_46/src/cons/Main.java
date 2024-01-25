package cons;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<BankAccount>bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("DE12345678901234567890","Leon"));
        bankAccounts.add(new BankAccount("DE09876543211234567890","John"));

        printIBAN(bankAccounts);



    }

    public static void printIBAN (List<BankAccount>bankAccounts){

        bankAccounts.stream()
                .map(a ->replaceString(a.getiBAN()) )
                .forEach(System.out::println);
    }
    private static String replaceString (String string){
        char[]chars = string.toCharArray();
        for (int i = 3; i<string.length(); i++){
            chars[i] = '*';
        }
        return new String(chars);
    }
}
