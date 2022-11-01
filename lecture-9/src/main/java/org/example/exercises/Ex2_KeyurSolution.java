package org.example.exercises;

import java.util.Scanner;

public class Ex2_KeyurSolution
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        //taking input for a sentence from user
        System.out.printf("Enter a sentence: ");
        String sentenceEnteredIs = stdin.nextLine();
        //creating new array to split sentence into words
        String[] sentenceToWords = sentenceEnteredIs.toLowerCase().split(" ");
        //taking input for a search word from user
        System.out.printf("Enter the word you would like to search: ");
        String searchWordIs = stdin.nextLine().toLowerCase();
        //calling function to search how many times search word repeats
        wordSearchCounter(sentenceToWords, searchWordIs);
    }

    //function to check how many times search word repeats in the sentence
    static void wordSearchCounter(String[] sentenceToWords, String searchWordIs)
    {
        int wordCountIs = 0;
        for (int i = 0; i < sentenceToWords.length; i++)
        {
            if (searchWordIs.equals(sentenceToWords[i]))
            {
                wordCountIs += 1;
            }
        }
        if (wordCountIs > 1)
        {
            System.out.printf("Match found, your word repeats %d times", wordCountIs);
        }
        else if (wordCountIs == 1)
        {
            System.out.printf("Match found, your word does not repeat", wordCountIs);
        }
        else
        {
            System.out.printf("Word not found!", wordCountIs);
        }
    }
}


