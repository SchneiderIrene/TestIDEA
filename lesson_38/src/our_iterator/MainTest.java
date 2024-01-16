package our_iterator;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    public void withoutMoreThanRequired_empty_test(){
        List<Integer> expected = List.of();
        List<Integer> actual = List.of();

        assertEquals(expected,Main.returnWithoutEl(actual,4));
    }

    @Test
    public void withoutMoreThanRequired_oneElt_test(){
        //   List<Integer> expected = Arrays.asList(1);
        //   List<Integer> actual = Arrays.asList(1);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);

        assertEquals(expected,Main.returnWithoutEl(actual,4));
    }

    @Test
    public void withoutMoreThanRequired_NoSuchElt_test(){
        //   List<Integer> expected = Arrays.asList(1);
        //   List<Integer> actual = Arrays.asList(1);

        List<Integer> expected = new ArrayList<>();
        //  expected.add(1);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(2);
        actual.add(3);
        actual.add(4);

        assertEquals(expected,Main.returnWithoutEl(actual,0));
    }

    @Test
    public void withoutMoreThanRequired_test(){
        //   List<Integer> expected = Arrays.asList(1);
        //   List<Integer> actual = Arrays.asList(1);

        List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(5);
        expected.add(3);
        expected.add(2);
        List<Integer> actual = new ArrayList<>();
        actual.add(1);
        actual.add(5);
        actual.add(3);
        actual.add(9);
        actual.add(2);

        assertEquals(expected,Main.returnWithoutEl(actual,8));
    }
}