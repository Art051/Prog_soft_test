package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex6_NoArgsLoops
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {
        //Create the following function (no arguments) and write the code to call it and display the result.

        readSingleDigit();
    }

    public static int readSingleDigit()
    {
        //Ask user to enter number, if number entered contains more than one digit then ask them to enter it again. Repeat until they enter a number with only one digit.
        //        Hint: Must be less than 10
        //        What about negative numbers?
        //        Conditional Loop

        int numberEntered;
        System.out.printf("Please enter a number: \n");
        numberEntered = Integer.parseInt(stdin.nextLine());

        while (numberEntered >= 10 || numberEntered < 0)
        {
            System.out.printf("Please enter another number: \n");
            numberEntered = Integer.parseInt(stdin.nextLine());
        }
        return numberEntered;
    }
}
