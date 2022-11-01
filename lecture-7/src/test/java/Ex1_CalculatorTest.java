import Lecture7.calculator.Ex1_Calculator;
import Lecture7.exceptions.DecimalOutPutException;
import Lecture7.exceptions.DivideByZeroException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex1_CalculatorTest
{
    // Function selections: 1 +,2 -, 3 *, 4 /


    @Test
    void testFunctionsWithinIntLimits() throws DivideByZeroException, DecimalOutPutException
    {
        assertEquals(32, Ex1_Calculator.performOperation(1, 5, 27));
        assertEquals(346208, Ex1_Calculator.performOperation(1, 345334, 874));
        assertEquals(-22, Ex1_Calculator.performOperation(2, 5, 27));
        assertEquals(344460, Ex1_Calculator.performOperation(2, 345334, 874));
        assertEquals(135, Ex1_Calculator.performOperation(3, 5, 27));
        assertEquals(301821916, Ex1_Calculator.performOperation(3, 345334, 874));
        assertEquals(5, Ex1_Calculator.performOperation(4, 135, 27));
        assertEquals(874, Ex1_Calculator.performOperation(4, 301821916, 345334));
    }


    @Test
    void testAdditionEdgeCases()
    {
        assertDoesNotThrow(() -> Ex1_Calculator.performOperation(1, 0, 2147483647));
        assertDoesNotThrow(() -> Ex1_Calculator.performOperation(1, 1, 2147483646));

        assertDoesNotThrow(() -> Ex1_Calculator.performOperation(1, 0, -2147483648));
        assertDoesNotThrow(() -> Ex1_Calculator.performOperation(1, -1, -2147483647));
    }

    @Test
    void testSubtractionEdgeCases()
    {
        assertDoesNotThrow(() -> Ex1_Calculator.performOperation(2, 0, 2147483647));
        assertDoesNotThrow(() -> Ex1_Calculator.performOperation(2, 0, -2147483647));
    }

    @Test
    void testAdditionBeyondIntLimitsThrowsArithmeticException()
    {
        assertThrows(ArithmeticException.class, () -> Ex1_Calculator.performOperation(1, -1, -2147483648));
        assertThrows(ArithmeticException.class, () -> Ex1_Calculator.performOperation(1, -100, -2147483648));
        assertThrows(ArithmeticException.class, () -> Ex1_Calculator.performOperation(1, 1, 2147483647));
        assertThrows(ArithmeticException.class, () -> Ex1_Calculator.performOperation(1, 100, 2147483647));
    }

    @Test
    void testSubtractionBeyondIntLimitsThrowsArithmeticException()
    {
        assertThrows(ArithmeticException.class, () -> Ex1_Calculator.performOperation(2, 1, -2147483648));
        assertThrows(ArithmeticException.class, () -> Ex1_Calculator.performOperation(2, -100, 2147483647));
    }

    @Test
    void testMultiplicationBeyondIntLimitsThrowsArithmeticException()
    {
        assertThrows(ArithmeticException.class, () -> {Ex1_Calculator.performOperation(3, 3434354, 546754);});
        assertThrows(ArithmeticException.class, () -> {Ex1_Calculator.performOperation(3, 123456789, -987654321);});
        assertThrows(ArithmeticException.class, () -> {Ex1_Calculator.performOperation(3, -65789761, -876578);});
        assertThrows(ArithmeticException.class, () -> {Ex1_Calculator.performOperation(3, -978686, 2147483647);});
        assertThrows(ArithmeticException.class, () -> {Ex1_Calculator.performOperation(3, -978686, 2147483647);});
    }

    @Test
    void testDivisionByZeroThrowsException()
    {
        assertThrows(DivideByZeroException.class, () -> Ex1_Calculator.performOperation(4, 1, 0));
        assertThrows(DivideByZeroException.class, () -> Ex1_Calculator.performOperation(4, 345678987, 0));
    }

    @Test
    void testDivisionProductDecimalThrowsException()
    {
        assertThrows(DecimalOutPutException.class, () -> {Ex1_Calculator.performOperation(4, 1, 2);});
        assertThrows(DecimalOutPutException.class, () -> {Ex1_Calculator.performOperation(4, 345678987, 546464);});
    }

    @Test
    void testPowerFunction()
    {
        assertEquals(64, Ex1_Calculator.aPowB(8, 2));
        assertEquals(19683, Ex1_Calculator.aPowB(3, 9));
    }

    @Test
    void testSquareRoot()
    {
        assertEquals(Math.sqrt(64), Ex1_Calculator.squareRoot(64));
        assertEquals(Math.sqrt(1), Ex1_Calculator.squareRoot(1));
        assertEquals(Math.sqrt(25), Ex1_Calculator.squareRoot(25));
    }
}