package org.example.exercises;

import java.util.Scanner;

public class Ex4_RightAngleTriangle
{

    public static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        printTriangular("snowflake");

    }

    public static void printTriangular(String stringToPrint)
    {
        char[] stringAsCharacters = stringToPrint.toCharArray();

        int charactersToOutputOnThisLine = 1;
        int numberOfCharactersOutputOnLine = 0;

        for (int i = 0; i < stringAsCharacters.length; i++)
        {
            System.out.printf("%c ", stringAsCharacters[i]);
            numberOfCharactersOutputOnLine++;

            if (charactersToOutputOnThisLine == numberOfCharactersOutputOnLine)
            {
                System.out.printf("\n");
                numberOfCharactersOutputOnLine = 0;
                charactersToOutputOnThisLine++;

            }
        }
    }

}
