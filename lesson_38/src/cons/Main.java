package cons;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Address address1 = new Address("Street", 5);
        Address address2 = new Address("Street", 50);
        Address address3 = new Address("Street", 10);

        Person person1 = new Person("John", address1);
        Person person2 = new Person("Jack", address2);
        Person person3 = new Person("Ann", address3);

       // List<Person> people = Arrays.asList(person1,person2,person3);
        List<Person> people = List.of(person1,person2,person3);


        System.out.println(personList(people));
    }

    public static List<Address> personList (List<Person>people){
        List<Address> personAddress = new ArrayList<>();
        for (Person person: people){
           personAddress.add(person.getAddress());
        }
       return personAddress;
    }

}
