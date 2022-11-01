package extras;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Ex_9
{

    /*
    Create a game
    The first player enters a word
    The game randomly mixes the characters in the word to create an anagram and displays it
    The second player has 3 attempts to guess the word
    NOTE: We don’t care if the same letter gets moved twice, just randomly move each character starting at index 0, then at 1, then at 2, etc., until you reach the end of the string.

     Example:
     COMPUTER
     might become
     POMECURT
     */


    private static Scanner stdin = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args)
    {
        genRandCharArray(readString("Enter the word to be shuffled: "));
    }

    public static String readString(String prompt)
    {
        System.out.printf("%s", prompt);
        return stdin.nextLine();
    }


    public static void genRandCharArray(String inputString)
    {
        char[] inputCharArray = inputString.toCharArray();

        rand = new Random();
        String randomPosString = "";

        for (int i = 0; i < inputCharArray.length; i++)
        {
            int randIndex = rand.nextInt(inputCharArray.length);
            char temp = inputCharArray[randIndex];
            inputCharArray[randIndex] = inputCharArray[i];
            inputCharArray[i] = temp;
        }

        for (char character : inputCharArray)
        {
            randomPosString = randomPosString.concat(String.valueOf(character));
        }
        System.out.printf("%s", randomPosString);
    }
}
