package cons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        List<BankAccount>bankAccounts = new ArrayList<>();
        bankAccounts.add(new BankAccount("DE12345678901234567890","Leon"));
        bankAccounts.add(new BankAccount("DE09876543211234567890","John"));

        printIBAN(bankAccounts);
        System.out.println(printIBAN2(bankAccounts));

        String str = "DE12345678901234567890";
        System.out.println(printIBAN3(str));



    }

    public static void printIBAN (List<BankAccount>bankAccounts){

        bankAccounts.stream()
                .map(a ->replaceString(a.getiBAN()) )
                .forEach(System.out::println);
    }
    public static List<String> printIBAN2 (List<BankAccount>bankAccounts){

        return  bankAccounts.stream()
                .map(a ->{
                    char[]chars = a.getiBAN().toCharArray();
                    for (int i = 3; i<chars.length; i++){
                        chars[i] = '*';
                    }
                    return new String(chars);
                } )
                .collect(Collectors.toList());
    }

    public static String printIBAN3 (String str){
        return Stream.of(str.split(""))
                .skip(3)
                .map(c -> "*")
                .collect(Collectors.joining("", str.substring(0,3), ""));

    }

    private static String replaceString (String string){
        char[]chars = string.toCharArray();
        for (int i = 3; i<string.length(); i++){
            chars[i] = '*';
        }
        return new String(chars);
    }
}
