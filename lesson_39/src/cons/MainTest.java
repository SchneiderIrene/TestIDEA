package cons;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    public void withoutNamesLengthFourTest(){
        List<String>actual = new ArrayList<>();
        actual.add("Bill");
        actual.add("Amalia");
        actual.add("John");
        actual.add("Kim");

        List<String>expected = new ArrayList<>();
        expected.add("Amalia");
        expected.add("Kim");

        assertEquals(expected, Main.withoutLength4(actual));
        assertEquals(expected, Main.withoutLength4_2(actual));
    }

}