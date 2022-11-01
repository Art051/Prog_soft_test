package org.example;

import java.util.Arrays;

public class Main
{
    /*
    Write a program that displays a counter from 0 to 999 using asterisks
    Example:
    Here’s a count from 8 to 12:

    | | | |     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | | |
    | | |*|     | | |*|     | | | |     | | | |     | | |*|
    | | |*|     | | |*|     | |*| |     | |*|*|     | |*|*|

    hundreds|tens|units


     */
    public static void main(String[] args)
    {
        // pair programming

        makingArray(999);
        makingArray(97);
        makingArray(6);

    }

    public static void makingArray(int inputNumber)
    {

        int hundreds = inputNumber / 100;
        int tens = inputNumber / 10 % 10;
        int units = inputNumber % 10;

        int rows = 9, columns = 3;

        char[][] counter = new char[rows][columns];

        for (int i = 0; i < counter.length; i++)
        {
            for (int j = 0; j < (counter[i].length); j++)
            {
                if (i < hundreds)
                {
                    counter[i][0] = '*';
                }
                if (i < tens)
                {
                    counter[i][1] = '*';
                }
                if (i < units)
                {
                    counter[i][2] = '*';
                }
            }
        }

        for (int i = counter.length - 1; i >= 0; i--)
        {
            System.out.printf("%s\n", Arrays.toString(counter[i]));
        }
        System.out.printf("%s\n", "__________________");
        System.out.printf("%s\n", "100s | 10s | units");

    }

    //First attempt below this line:
// Come back to maybe, involves printing individual lines, no array usage - Attempt 1 (moved to using arrays instead of this)
    public static void printStars(int numberToDisplay)
    {
        int hundredsColum = numberToDisplay / 100;
        int tensColumn = numberToDisplay / 10 & 10;
        int unit = numberToDisplay % 10;


        System.out.printf("The number being displayed is %d\n", numberToDisplay);

        if (numberToDisplay < 10)
        {

            for (int i = 0; i < numberToDisplay; i++)
            {
                printUnits();
            }
            System.out.printf("%s\n", "__________________");
            System.out.printf("%s\n", "100s | 10s | units");
        }
        else if (numberToDisplay >= 11 && numberToDisplay < 100)
        {
            printTens();
        }
        else if (numberToDisplay >= 100)
        {
            printHundreds();
        }
    }

    public static void printUnits()
    {
        System.out.printf("%s\n", "     |     |   *  ");

    }

    public static void printTens()
    {
        System.out.printf("%s\n", "     |  *  |      ");

    }

    public static void printHundreds()
    {
        System.out.printf("%s\n", "  *  |     |      ");

    }
}