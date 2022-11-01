package org.example;

import java.util.Scanner;

public class Main
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
//        String[] listOfWords = new String[10];
//        String wordEntered;
//
//
//        for (int i = 0; i < listOfWords.length; i++)
//        {
//            System.out.printf("Enter a word: \n");
//            wordEntered = stdin.nextLine();
//            listOfWords[i] = wordEntered;
//        }
//
//        System.out.printf("Enter a word to search for: \n");
//        wordEntered = stdin.nextLine();
//
//        boolean found = false;
//        for (String currentWord : listOfWords)
//        {
//            if (currentWord.equals(wordEntered))
//            {
//                found = true;
//                break;
//            }
//        }
//
//        if (!found)
//        {
//            System.out.printf("'%s' was not found", wordEntered);
//        }
//        else
//        {
//            System.out.printf("'%s' has been found", wordEntered);
//        }


        // Mine:

        arthurApproach();
        timApproach();


    }

    public static void arthurApproach()
    {
        String[] originalWords = createWordsList(10);
        String searchWord = readString("Enter a word to search for: \n");
        boolean isWordFound = findWordInArray(originalWords, searchWord);
        System.out.printf("%s\n", chooseMessage(isWordFound));
    }

    public static void timApproach()
    {
        //allocate the list of words:
        final int wordCount = 10;
        String[] wordList = new String[wordCount];

        //Read the list in from the users
        readValues(wordList, wordCount);

        String wordSearching = readString("Please enter a word to search for: \n");

        //search for the word
        boolean wordWasFound = findWord(wordList, wordCount, wordSearching);

        //print out whether the word was found:
        chooseMessagePrinted(wordWasFound);
    }

    public static boolean findWord(String[] wordList, final int listSize, String searchWord)
    {
        for (int i = 0; i < listSize; i++)
        {
            if (wordList[i].equals(searchWord))
            {
                return true;
            }
        }
        return false;
    }

    public static String readString(String prompt)
    {
        System.out.printf("%s", prompt);
        String wordIn = stdin.nextLine();
        return wordIn;
    }


    public static void readValues(String[] wordList, final int listSize)
    {
        for (int i = 0; i < listSize; i++)
        {
            wordList[i] = readString("Enter word " + (i + 1) + ": \n");
        }
    }

    public static String[] createWordsList(int length)
    {
        String[] wordsList = new String[length];

        for (int i = 0; i < wordsList.length; i++)
        {
            wordsList[i] = readString("Enter a word for the list: \n");
        }
        return wordsList;
    }

    public static boolean findWordInArray(String[] stringArray, String searchedWord)
    {
        for (String currentWord : stringArray)
        {
            if (currentWord.equals(searchedWord))
            {
                return true;
            }
        }
        return false;
    }

    public static String chooseMessage(boolean isWordFound)
    {
        if (isWordFound)
        {
            return "Word found!";
        }
        return "Word not found!";
    }

    public static void chooseMessagePrinted(boolean isWordFound)
    {
        if (isWordFound)
        {
            System.out.printf("%s", "Word found!");
        }
        else
        {
            System.out.printf("%s", "Word not found!");
        }

    }
}