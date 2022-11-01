package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex7_NamesInArrays
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {
        //        Create the following function (no arguments) and write the code to call it and display the results. Return an array.
        //            string[ ]   readNames()
        //            Get user to enter 5 names and return them in an array

        System.out.printf(Arrays.toString(readNames()));

    }

    public static String[] readNames()
    {
        String[] names = new String[5];
        String name;

        for (int i = 0; i < names.length; i++)
        {
            System.out.printf("Enter a name: \n");
            name = stdin.nextLine();
            names[i] = name;
        }
        return names;
    }
}
