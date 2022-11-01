import java.util.Random;
import java.util.Scanner;

public class Main
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {
        //Functions (methods)

        /*
        System.out.printf("Now running main function\n");
        sayOK();
        System.out.printf("%s\n", okString());
        hello("Bob");
        System.out.printf("Now finishing main function\n");

        int number = 7;
        System.out.printf("Before function call, the number is %d\n", number);
        add5ToNumber(number);
        System.out.printf("After function call, the number is %d\n", number);

        double division = divideEight(3);
        System.out.printf("%.2f", division);


       int result = addTwoNumbers(3, 4);
        System.out.printf("Result is: %d ", result);

        */


        readIntegerFromConsole("Please enter an integer: \n");

    }

    static void sayOK()
    {
        System.out.printf("OK\n");
    }

    static String okString()
    {
        return "OK";
    }

    //procedure declaration pattern
    static void hello(String user)
    {
        System.out.printf("Hello, %s\n", user);
    }

    //scope of variables in methods
    static void add5ToNumber(int number)
    {
        System.out.printf("Before addition, the number is %d\n", number);
        number += 5;
        System.out.printf("After addition, the number is %d\n", number);
    }

    //declaring return types
    static int readNumber(String message)
    {
        int number = Integer.parseInt(stdin.nextLine());
        return number;
    }

    static double divideEight(double number)
    {
        return number / 8;
    }

    //function to add two numbers together:
    static int addTwoNumbers(int firstNum, int secondNumber)
    {
        return firstNum + secondNumber;
    }



    ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
    // FUNCTIONS WE WILL USE THROUGHOUT EXERCISES
    static int readIntegerFromConsole(String message)
    {
        System.out.printf("%s", message);
        int readNumber = 0;
        boolean readSuccessfully;

        do
        {
            readSuccessfully = true;

            try
            {
                readNumber = Integer.parseInt(stdin.nextLine());
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Failed to read integer please try again: \n");
                readSuccessfully = false;
            }

        } while (readSuccessfully != true);

        return readNumber;
    }
}