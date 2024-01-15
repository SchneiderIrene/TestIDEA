package cons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

@Test
    public  void personList_test_empty(){
    assertEquals(List.of(), Main.personList(List.of()));
}

    @Test
    public  void personList_test_One(){
        Address address1 = new Address("Street", 5);
        Person person1 = new Person("John", address1);
        List<Address> expected = List.of(address1);
        List<Person> actual = List.of(person1);
        assertEquals(expected, Main.personList(actual));
    }

    @Test
    public  void personList_test_Two(){
        Address address1 = new Address("Street", 5);
        Address address2 = new Address("Street", 50);

        Person person1 = new Person("John", address1);
        Person person2 = new Person("Jack", address2);

        List<Address> expected = List.of(address1, address2);
        List<Person> actual = List.of(person1, person2);
        assertEquals(expected, Main.personList(actual));
    }

}