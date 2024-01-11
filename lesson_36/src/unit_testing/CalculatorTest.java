package unit_testing;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calculator;


    @BeforeEach
    public void setUp (){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple multiplication should be correct")
    public void testMultiply(){
        assertEquals(6, calculator.multiply(2,3));
    }

    @Test
    @DisplayName("Checking Zero")
    public  void testMultiplyZero (){
        assertEquals(0, calculator.multiply(0,5));
        assertEquals(0, calculator.multiply(5,0));
    }

    @Test
    public void  given3and0_whenCompare_thenReturnTrue (){
        assertTrue(calculator.compareNumbers(3,0));
        assertFalse(calculator.compareNumbers(0,3));
    }

    @Test
    public void  given3LessThan1_whenResFalse_thenReturnTrue (){
        assertFalse(calculator.compareNumbers(1,3));
    }


}