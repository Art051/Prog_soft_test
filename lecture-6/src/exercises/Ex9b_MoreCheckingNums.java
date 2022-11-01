package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex9b_MoreCheckingNums
{

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        /*
        The user enters a value which must be a number, if they enter a value which is not a legal number
        e.g. “abc” they must be prompted to re-enter the value until they provide a valid number.
        The number entered must also be in the range 20 to 50 to be considered valid,
        and they should be prompted to re-enter the number if it is not in this range.

Constraint: Break this problem into two parts:
Read from user until a number is entered
Check number is in range

number = readInteger(“Enter number”);
while(InRange(number) == false)
{
     number = ReadNumber(“Enter number in range 20 to 50”);
     }
Write the code for the functions readInteger(…) and InRange(…)
         */


        int number = readInteger("Enter number\n");
        while (inRange(number) == false)
        {
            number = readInteger("Enter number in range 20 to 50\n");
        }
    }

    public static int readInteger(String prompt)
    {
        boolean read = true;
        int enteredNumber = 0;

        System.out.printf(prompt);
        while (read)
        {
            try
            {
                enteredNumber = Integer.parseInt(stdin.nextLine());
                read = false;
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Try again, that wasn't a valid entry: \n");
            }
        }
        return enteredNumber;
    }

    public static boolean inRange(int number)
    {
        return ((number >= 20) && (number <= 50));
    }

}
