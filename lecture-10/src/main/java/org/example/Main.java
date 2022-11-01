package org.example;

import java.util.Scanner;

public class Main
{

    public static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        // Lecture work:


        System.out.printf("Please enter a valid number: \n");
        String inputString = stdin.nextLine();

        // this block shows the method which checks individual characters
        System.out.println(checkIfCharacterNumber('0'));
        System.out.println(checkIfCharacterNumber('5'));
        System.out.println(checkIfCharacterNumber('9'));
        System.out.println(checkIfCharacterNumber('a'));
        System.out.println(checkIfCharacterNumber('j'));
        System.out.println(checkIfCharacterNumber('z'));
        System.out.println(checkIfCharacterNumber('!'));


        // this block shows the method which checks an entire string input, it calls upon te checkIfStringIsNumber method
        System.out.printf("%s\n", (checkIfStringIsNumber("12344")));
        System.out.printf("%s\n", (checkIfStringIsNumber("12a34")));
        System.out.printf("%s\n", (checkIfStringIsNumber("vf12a34a")));
        System.out.printf("%s\n", (checkIfStringIsNumber("dfdfgfr")));
        System.out.printf("%s\n", (checkIfStringIsNumber(inputString)));


    }


    public static boolean checkIfStringIsNumber(String stringToCheck)
    {
        if (stringToCheck.length() == 0)
        {
            return false;
        }

        char[] stringAsCharacters = stringToCheck.toCharArray();


        for (char c : stringAsCharacters)
        {
            if (!(checkIfCharacterNumber(c)))
            {
                return false;
            }
        }
        return true;
    }

    public static boolean checkIfCharacterNumber(char character)
    {
        return (character >= 48 && character <= 57);
    }
}