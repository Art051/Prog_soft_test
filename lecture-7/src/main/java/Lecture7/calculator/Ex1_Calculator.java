package Lecture7.calculator;

import Lecture7.exceptions.DecimalOutPutException;
import Lecture7.exceptions.DivideByZeroException;
import Lecture7.exceptions.FactorialException;

import java.util.Scanner;

public class Ex1_Calculator
{

    /*
    Add more calculator functions such as basic operations (+, -, *, /), powers, square root, etc.
    Add appropriate exceptions and exception handling.
    Write lots of tests for each of your functions.
     */
    private static final Scanner stdin = new Scanner(System.in);

    public static int performOperation(int functionSelection, int numOne, int numTwo) throws DecimalOutPutException, DivideByZeroException
    {

        // Function selections: 1 +,2 -, 3 *, 4 /
        int outputNum = 0;
        switch (functionSelection)
        {
            case (1):
                outputNum = Math.addExact(numOne, numTwo);
                break;
            case (2):
                outputNum = Math.subtractExact(numOne, numTwo);
                break;
            case (3):
                outputNum = Math.multiplyExact(numOne, numTwo);
                break;
            case (4):
                if (numOne == 0 || numTwo == 0)
                {
                    throw new DivideByZeroException("You can't divide by zero!\n");
                }
                if (numOne % numTwo != 0)
                {
                    throw new DecimalOutPutException("Sorry, this calculator doesn't have space for fractional/decimal output.\n");
                }
                else
                {
                    outputNum = numOne / numTwo;
                }
                break;
            case (5):

        }
        return outputNum;
    }

    public static int factCustException(int num) throws FactorialException
    {
        if (num >= 13)
        {
            throw new FactorialException("Integer overflow: cannot factorialise numbers over 12.");
        }
        if (num > 1)
        {
            return num *= factCustException(num - 1);
        }
        else if (num < 0)
        {
            throw new FactorialException("Cannot factorialise numbers less than 0.");
        }
        else
        {
            return 1;
        }
    }

    public static int aPowB(int numA, int power)
    {
        int total = numA;
        for (int i = 1; i < power; i++)
        {
            total *= numA;
        }
        return total;
    }

    public static double squareRoot(int number)
    {

        int rootAnswer = 1;

        for (int i = 1; i < number; i++)
        {
            if ((i * i) == number)
            {
                rootAnswer = i;
            }
        }
        return rootAnswer;
    }
}
