package org.example.exercises;

import java.util.Scanner;

public class Ex2_ReadWholeWords
{
    // Expand comment block below to see exercise instructions
    /*
    Identify the requirements and constraints.
Write a program that allows the user to enter a sentence and a word.
The program should display the number of times the word appears in the sentence
This does not include parts of words e.g. “seaview” is not counted if we are looking for the word “sea”

For example:
They enter “This is a great big blue ship with blue sails”
They enter the word “blue”
The program prints 2

Simplify: Can you read and test just the first word?
Hint 1: What separates the words in a sentence?
Hint 2: In the string, find the positions of the first and last characters in word  could copy word into a new string
     */

    private static Scanner stdin = new Scanner(System.in);


    public static void main(String[] args)
    {

        String originalSentence = readString("Enter a sentence: \n");
        String[] sentenceAsArrayList = setStringArrayFromSentence(originalSentence);

        String searchWord = readString("Enter a word to search for: \n");

        int foundCount = searchForWordReturnCount(sentenceAsArrayList, sentenceAsArrayList.length, searchWord);
        declareFoundCount(foundCount, searchWord, originalSentence);
    }


    //read in a sentence or word
    public static String readString(String prompt)
    {
        System.out.printf("%s", prompt);
        return stdin.nextLine();
    }


    //split and return sentence as individual words inside an array
    public static String[] setStringArrayFromSentence(String originalSentence)
    {
        return (originalSentence.split(" "));
    }


    //find the word being searched for and return the count of times it is found
    public static int searchForWordReturnCount(String[] sentenceAsArray, int listSize, String searchWord)
    {
        int countFound = 0;
        for (int i = 0; i < listSize; i++)
        {
            if (sentenceAsArray[i].equals(searchWord))
            {
                countFound++;
            }
        }
        return countFound;
    }


    // print to console the number of times the word was found
    public static void declareFoundCount(int foundCount, String searchWord, String originalSentence)
    {
        System.out.printf("The original sentence was: \n%s\n", originalSentence);
        System.out.printf("The word '%s' was found %d times!\n", searchWord, foundCount);
    }
}
