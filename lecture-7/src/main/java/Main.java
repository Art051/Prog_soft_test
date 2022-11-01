import Lecture7.calculator.Ex1_Calculator;
import Lecture7.exceptions.DecimalOutPutException;
import Lecture7.exceptions.DivideByZeroException;
import Lecture7.exceptions.FactorialException;

import java.util.Scanner;

public class Main
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) throws FactorialException, DecimalOutPutException, DivideByZeroException
    {

/*
                System.out.printf("%d", factorial(5));
                System.out.printf("%d", factorial(3));
                System.out.printf("%d", factorial(0));
                System.out.printf("%d", factorial(-1));

                System.out.printf("Tim's Factorial Iterative\n");
                System.out.printf("5 = %d\n", timFactorialIterative(5));
                System.out.printf("-1 = %d\n", timFactorialIterative(-1));

                System.out.printf("Tim's Factorial Recursive\n");
                System.out.printf("5 = %d\n", timFactorialRecursive(5));
                System.out.printf("-1 = %d\n", timFactorialRecursive(-1));

                System.out.printf("%d\n", factorial(15));

        //use a try-catch block to use the factorial method

        try
        {
            System.out.printf("%d", factorial(13));
        }
        catch (Lecture7.exceptions.FactorialException exception)
        {
            System.out.printf("%s", exception.getMessage());
        }
        basicManualTests();

        int testNum = Integer.parseInt(stdin.nextLine());
        int result = factorialT(testNum);
        System.out.printf("%d\n", result);


        int testNum = Integer.parseInt(stdin.nextLine());
        int result = 0;
        try
        {
            result = factCustException(testNum);
        }
        catch (Lecture7.exceptions.FactorialException ex)
        {
            System.out.printf("%s", ex.getMessage());
            return;
        }
        System.out.printf("%d\n", result);

        int ans = Ex1_Calculator.aPowB(4,3);
        System.out.println(ans);

        */

        // Function selections: 1 +,2 -, 3 *, 4 /


        //this should work fine, the division results in a whole number
        try
        {
            int decimalRemainder = Ex1_Calculator.performOperation(4, 4, 2);
            System.out.println(decimalRemainder);
        }
        catch (DecimalOutPutException e)
        {
            System.out.printf("%s", e.getMessage());
        }


        //this should throw an error due to the division causing a decimal result
        try
        {
            int decimalRemainder = Ex1_Calculator.performOperation(4, 4, 3);
            System.out.println(decimalRemainder);
        }
        catch (DecimalOutPutException e)
        {
            System.out.printf("%s", e.getMessage());
        }
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

    //method used for example of JUnit tests without custom Exception
    public static int factorialT(int num)
    {
        if (num > 1)
        {
            return num *= factorialT(num - 1);
        }
        else if (num < 0)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public static int factorial(int num) throws FactorialException
    {

        if (num < 0)
        {
            throw new FactorialException("Cannot factorialise numbers less than 0.");
        }
        else if (num > 15)
        {
            throw new FactorialException("Integer overflow: Cannot factorialise  numbers over 15.");
        }
        else if (num == 0)
        {
            return 1;
        }
        else
        {
            int factorial = 1;
            for (int i = 1; i <= num; i++)
            {
                factorial *= i;
            }
            return factorial;
        }
    }

    //
    //    public static int timFactorial(int num){
    //
    //    }

    public static int timFactorialIterative(int num)
    {
        if (num < 0)
        {
            return -1;
        }
        int fact = 1;
        for (int multiplier = 2; multiplier <= num; multiplier++)
        {
            fact *= multiplier;
        }
        return fact;
    }


    public static int timFactorialRecursive(int num) //  Recursive: a function which calls itself until reaching a “base case”
    {
        if (num > 1)
        {
            return num * timFactorialRecursive(num - 1);
        }
        else if (num < 0)
        {
            return -1;
        }
        else
        {
            return 1;
        }
    }

    public static void basicManualTests()
    {
        int testNum = Integer.parseInt(stdin.nextLine());
        int factIterative = timFactorialIterative(Integer.parseInt(stdin.nextLine()));
        int factRecursive = timFactorialRecursive(Integer.parseInt(stdin.nextLine()));
        System.out.printf("Iterative: %d\nRecursive: %d\n", factIterative, factRecursive);
    }
}