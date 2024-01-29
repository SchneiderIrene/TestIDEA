package cons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main2 {
    /* Пусть есть класс BankAccount c полем String IBAN  и класс Person c полями name  и List<BankAccount>
     Написать метод, который вернет лист IBANs с номерами , замененными звездочками после 3 символа
     */
    public static void main(String[] args) {
        List<BankAccount2> list1 = new ArrayList<>();
        list1.add(new BankAccount2("DE0987654321"));
        list1.add(new BankAccount2("DE8888888888"));

        List<BankAccount2> list2 = new ArrayList<>();
        list2.add(new BankAccount2("DE66666666666666"));
        list2.add(new BankAccount2("DE999999999999999"));

        List<BankAccount2> list3 = new ArrayList<>();
        list3.add(new BankAccount2("DE22222222222222222222"));
        list3.add(new BankAccount2("DE333333333333333"));


        List<Person>personList = new ArrayList<>();
        personList.add(new Person("John", list1));
        personList.add(new Person("Jack", list2));
        personList.add(new Person("Ann", list3));

        System.out.println(ibansListWithStarts(personList));


    }
    public static List<String>ibansListWithStarts(List<Person> personList){
        return personList.stream()
                .flatMap(p -> p.getIbans().stream())
                .map(BankAccount2::getIBAN)
                .map(Main2::ibanStar)
                .collect(Collectors.toList());

    }
    private static String ibanStar (String string){
        char[]chars = string.toCharArray();
        for (int i =2; i<string.length(); i++){
            chars[i]='*';
        }
        return new String(chars);
    }
}
