package org.example.exercises;

import java.util.Scanner;

public class Ex1_ReverseWord
{
    // Expand comment block below to see exercise instructions
        /*
User must be able to enter a word
Letters in word must be reversed
Must display the reversed word

Constraints
Letters in reversed word are the same as those entered
Work the problem
Clearly we need to be able to read each letter from the original word
First letter becomes the last letter, etc
Implies we need to read one letter at a time
Implies we need to repeat reading
Read from front of string
Write to back of string

         */


    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        String wordToReverse = readWordIn("Enter a word to be reversed: ");

        printResult(reverseWord(wordToReverse) + "\n");
        printResult(reverseWordStringBuilder(wordToReverse) + "\n");
        printResult(reverseWordStringBuilderForLoop(wordToReverse) + "\n");
        printResult(reverseWordForLoopString(wordToReverse) + "\n");
        printResult(reversedWordV2(wordToReverse) + "\n");
    }


    public static String readWordIn(String prompt)
    {
        System.out.printf("%s", prompt);
        return stdin.nextLine();
    }


    // make a method for printing the output
    public static void printResult(String reversedWord)
    {
        System.out.printf("%s", reversedWord);
    }


    // use for-loop with (array.length/2) to iterate from both sides of the array simultaneously
    public static void abSwapCharacters(char[] arrayToSwap) // do not need to return a new char[], the method changes the input char[]
    {
        int arrayLength = arrayToSwap.length;
        char tempSwap;

        for (int i = 0; i < (arrayLength / 2); i++)
        {
            tempSwap = arrayToSwap[i];
            arrayToSwap[i] = arrayToSwap[(arrayLength - 1) - i];
            arrayToSwap[(arrayLength - 1) - i] = tempSwap;
        }
    }


    // System.out.printf("Using char[] to split word, iterate backwards through the input word, assign each char in the word to the opposite index of the char array.
    // Then append the chars in the array onto an originally empty string, one char at a time, by doing a for each loop.
    public static String reverseWord(String wordToReverse)
    {
        char[] wordChars = new char[wordToReverse.length()];

        for (int i = 0; i < wordToReverse.length(); i++)
        {
            wordChars[i] = wordToReverse.charAt(wordToReverse.length() - 1 - i);
        }

        String reversed = "";
        for (char charcter : wordChars)
        {
            reversed += charcter;
        }
        return reversed;
    }


    // Using String Builder, iterate through the word to reverse backwards, inserting each char at index '0' of the String Builder to essentially prepend the char.
    public static String reverseWordStringBuilder(String wordToReverse)
    {
        StringBuilder reversedWord = new StringBuilder();
        for (char character : wordToReverse.toCharArray())
        {
            reversedWord.insert(0, character);
        }
        return String.valueOf(reversedWord);
    }


    // same as above - but using a standard for loop (to show Kai difference between for each vs for)
    public static String reverseWordStringBuilderForLoop(String wordToReverse)
    {
        StringBuilder reversedWord = new StringBuilder();
        char[] wordToReverseChars = wordToReverse.toCharArray();

        for (int i = 0; i < wordToReverse.length(); i++)
        {
            reversedWord.insert(0, wordToReverseChars[i]);
        }
        return String.valueOf(reversedWord);
    }


    // same as above but using a String rather than StringBuilder
    public static String reverseWordForLoopString(String wordToReverse)
    {
        String reversedWord = "";
        char[] wordToReverseChars = wordToReverse.toCharArray();

        for (int i = wordToReverse.length() - 1; i >= 0; i--)
        {
            reversedWord += (wordToReverseChars[i]);                                        //These lines are interchangeable, comment out one to use the other
            reversedWord = reversedWord.concat(String.valueOf(wordToReverseChars[i]));      //These lines are interchangeable, comment out one to use the other
        }
        return reversedWord;
    }


    // Using standard String, iterating through the original word as before, but concatenating the reversed word after each character,
    // essentially adding the existing reversed word onto the end of the current char
    public static String reversedWordV2(String wordToReverse)
    {
        String reversedWord = "";
        for (char letter : wordToReverse.toCharArray())
        {
            reversedWord = String.valueOf(letter).concat(reversedWord);
        }
        return reversedWord;
    }
}
