package cons;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    private Main main;
    String input;
    Predicate<String> predicate;
    Function<String, String> function;
    @BeforeEach
    public  void  setUp (){
        input = "aaa BBBB dDD eeEEe lll";
    }

   @Test
   public void  test_3UpperCase (){
        predicate = i -> i.length()==3;
        function = String::toUpperCase;

        assertEquals("AAA BBBB DDD eeEEe LLL", Main.transformer(input, predicate, function));
    }
    @Test
    public void  test_4LowerCase (){
        predicate = i -> i.length()==4;
        function = String::toLowerCase;

        assertEquals("aaa bbbb dDD eeEEe lll", Main.transformer(input, predicate, function));
    }

    @Test
    public void  test_5 (){
        predicate = i -> i.length()==5;
        function = s -> "*****";

        assertEquals("aaa BBBB dDD ***** lll", Main.transformer(input, predicate, function));
    }








}