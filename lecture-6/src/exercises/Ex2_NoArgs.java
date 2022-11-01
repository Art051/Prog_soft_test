package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex2_NoArgs
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {

        displayNumber();
        displaySquareOfNumberEntered();
        displayCountdown();
        displayCalculatedSum();

    }


    //    Create the following procedures (no arguments) that perform the specified actions and write the code to call them.

    //    void displayNumber()
    //    ?? number = 3;
    //    System.out.printf(number);
    public static void displayNumber()
    {
        int number = 3;
        System.out.printf("%d\n", number);
    }


    //displaySquareOfNumberEntered()
    //Read a number from the user then display the squared value e.g. user enters 3, so 9 is displayed
    public static void displaySquareOfNumberEntered()
    {
        int userInput;
        System.out.printf("Enter a number: \n");
        userInput = Integer.parseInt(stdin.nextLine());
        int squared = userInput * userInput;
        System.out.printf("%d\n", squared);
    }


    //displayCountdown()
    //Display a count from 9 to 0 using the counting loop pattern
    public static void displayCountdown()
    {
        int countFrom = 9;

        for (int i = countFrom; i >= 0; i--)
        {
            System.out.printf("%d\n", i);
        }
    }

    //displayCalculatedSum()
    //Read three values entered by the user, then add them and display the result
    public static void displayCalculatedSum()
    {
        int sum = 0;
        int countLimit = 3;
        for (int i = 0; i < countLimit; i++)
        {
            sum += Integer.parseInt(stdin.nextLine());
        }
        System.out.printf("%d\n", sum);


    }
}
