package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex9a_CheckNum
{

    private static final Scanner stdin = new Scanner(System.in);
    private static final Random rng = new Random();


    public static void main(String[] args)
    {
        //        Using the Check Number Pattern create two functions, one to read an integer and the other a double.
        //            Use your function to ask the user to enter a price

        int integerInput = readInt("Enter an integer: \n");
        double doubleInput = readDouble("Enter a double: \n");
        System.out.printf("Integer: %d \nDouble: %.2f", integerInput, doubleInput);
    }

    public static int readInt(String prompt)
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
                System.out.printf("Wrong! Try again: \n");
            }
        }
        return enteredNumber;
    }

    public static double readDouble(String prompt)
    {
        boolean read = true;
        double enteredNumber = 0;

        System.out.printf(prompt);
        while (read)
        {
            try
            {
                enteredNumber = Double.parseDouble(stdin.nextLine());
                read = false;
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Wrong! Try again: \n");
            }
        }
        return enteredNumber;
    }
}
