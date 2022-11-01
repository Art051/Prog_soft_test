package org.example;

import java.util.Scanner;

public class Main
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
//        //String from the user - to be "encrypted"
//        System.out.printf("Please enter some text to encrypt: ");
//        String encryptString = stdin.nextLine();
//        //Shift value
//        System.out.printf("Please enter a value to shift by: ");
//        int shiftValue = Integer.parseInt(stdin.nextLine());
//
        letsEncryptAString();
    }

    public static void letsEncryptAString()
    {
        System.out.printf("Enter String to encrypt: ");
        String encryptString = stdin.nextLine();

        System.out.printf("Enter shift value: ");
        int shiftValue = Integer.parseInt(stdin.nextLine());

        System.out.printf("%s", encryptWholeSentence(encryptString, shiftValue));
    }

    public static String encryptWholeSentence(String sentence, int shiftValue) // loops through sentence and calls the encryptCharacter Method on each character
    {
        String encryptedSentence = "";

        for (char character : sentence.toCharArray())
        {
            try
            {
                encryptedSentence += encryptCharacter(character, shiftValue);

            }
            catch (CharacterEncryptionException e)
            {
                throw new RuntimeException(e);
            }
        }
        return encryptedSentence;
    }

    public static char encryptCharacter(char charToEncrypt, int shiftValue) throws CharacterEncryptionException
    {
        if (shiftValue < 0)
        {
            throw new CharacterEncryptionException("Does not support negative shift.");
        }
        int charRepresentation = charToEncrypt;
        shiftValue = shiftValue % 26;
        if (charToEncrypt >= 'a' && charToEncrypt <= 'z')
        {
            //Lower case character
            if ((char) charRepresentation - shiftValue < 'a')
            {
                //Distance to 'a':
                int distanceToA = (char) charRepresentation - 'a';
                //-1 represents the shift from z to a
                shiftValue -= distanceToA + 1;
                charRepresentation = 'z';
            }
        }
        else if (charToEncrypt >= 'A' && charToEncrypt <= 'Z')
        {
            //Upper case character
            if ((char) charRepresentation - shiftValue < 'A')
            {
                //Distance to 'a':
                int distanceToA = (char) charRepresentation - 'A';
                //-1 represents the shift from z to a
                shiftValue -= distanceToA + 1;
                charRepresentation = 'Z';
            }
        }
        else if (charToEncrypt == ' ') // added for spaces in sentence
        {
            return charToEncrypt;
        }

        else
        {
            throw new CharacterEncryptionException("Invalid character entered.");
        }
        charRepresentation -= shiftValue;
        return (char) charRepresentation;
    }
}