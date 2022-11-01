package exercises;

import java.util.Scanner;

public class Ex3_ArrayReadWrite
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        /*
        Using the array write and read patterns together:
        Create an array to contain the values 0.234, 0.999, 1.999, 28.899 and -0.8372
        The user enters a multiplier
        Multiply each value in the array by the multiplier provided and display the results
         */

        double multiplier;
        double[] values = {0.234, 0.999, 1.999, 28.899, -0.8372};

        System.out.printf("Please enter a multiplier: \n");
        multiplier = Double.parseDouble(stdin.nextLine());

        //enhanced for loop
        System.out.printf("Enhanced for loop:\n");
        for (double value : values)
        {
            System.out.printf("%.2f\n", value * multiplier);
        }

        //standard for loop
        System.out.printf("Standard for loop:\n");
        for (int i = 0; i < values.length; i++)
        {
            System.out.printf("%.2f\n", values[i] * multiplier);
        }
    }
}