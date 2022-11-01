import Lecture7.exceptions.FactorialException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class MainTest
{
/*
Most of the time, we’ll use:
assertEquals(value1, value2)
assertNotEquals(value1, value2)
assertArrayEquals(value1, value2)
But it’s also worth knowing about:
assertDoesNotThrow(function) – makes sure the function doesn’t throw an error
assertNotNull(object) – this will make sense (and potentially be useful) once you study OO, but just take note of it for now.
assertTrue/assertFalse(bool)
assertAll(list of assertions) – lets you combine multiple assertions together.

 */


    @Test
    void factorialPositive() throws Exception
    {
        int result = Main.factorial(5);
        int expected = 120;
        assertEquals(expected, result);

//        int expectedFalse = 121;  // this is intentionally incorrect - running  this for the test results in a 'False' output due to 121 not being the factorial of 5
//        assertEquals(expectedFalse, result);

        // shorter version for easier input of multiple tests:
        assertEquals(120, Main.factorial(5));
        assertEquals(6, Main.factorial(3));
        assertEquals(1, Main.factorial(1));
    }

    @Test
    void factorialNegative() throws Exception
    {
        assertEquals(-1, Main.factorial(-10));
        assertEquals(-1, Main.factorial(-50));
    }

    @Test
    void factorialEdgeCase() throws Exception
    {
        assertEquals(1, Main.factorial(0));
        assertEquals(1, Main.factorial(1));
    }


    // now with custom exceptions - need to use assertThrows() in order to confirm if the method does throw the custom exception when expected
    @Test
    void factorialNegativeCustomException() throws Exception
    {
        assertThrows(FactorialException.class, () ->
        {
            Main.factCustException(-1);
        });
        assertThrows(FactorialException.class, () ->
        {
            Main.factCustException(-5);
        });
        assertThrows(FactorialException.class, () ->
        {
            Main.factCustException(-1000);
        });
    }

    @Test
    void factorialEdgeCasesCustomException() throws Exception
    {
        assertEquals(1, Main.factCustException(0));
        assertEquals(1, Main.factCustException(1));
        assertThrows(FactorialException.class, () ->
        {
            Main.factCustException(-13);
        });
    }

    @Test
    void factorialVeryLargeNumbersCustomException() throws Exception
    {
        assertThrows(FactorialException.class, () ->
        {
            Main.factCustException(25);
        });
        assertThrows(FactorialException.class, () ->
        {
            Main.factCustException(1000);
        });
    }
}