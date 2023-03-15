import org.example.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;


public class CalculatorTestCases {
    Calculator calculator = new Calculator();
    private static final Double DELTA=1e-15;
    @Test
    public void test_cases_for_sqrt()
    {
        assertEquals(3, calculator.sqrt(9), DELTA);
        assertEquals(15,calculator.sqrt(225),DELTA);
        assertEquals(25,calculator.sqrt(625),DELTA);
        assertEquals(1,calculator.sqrt(1),DELTA);
        assertEquals(0,calculator.sqrt(0),DELTA);
        assertNotEquals(10,calculator.sqrt(9),DELTA);
        assertNotEquals(77,calculator.sqrt(100),DELTA);
        assertNotEquals(52,calculator.sqrt(25),DELTA);
        assertNotEquals(12,calculator.sqrt(1),DELTA);

    }
    @Test
    public void test_cases_for_factorial()
    {
        assertEquals(1, calculator.factorial(0), DELTA);
        assertEquals(1,calculator.factorial(1),DELTA);
        assertEquals(3628800,calculator.factorial(10),DELTA);
        assertEquals(120,calculator.factorial(5),DELTA);
        assertEquals(40320,calculator.factorial(8),DELTA);
        assertNotEquals(10,calculator.factorial(9),DELTA);
        assertNotEquals(77,calculator.factorial(12),DELTA);
        assertNotEquals(52,calculator.factorial(25),DELTA);
        assertNotEquals(12,calculator.factorial(1),DELTA);
    }
}
