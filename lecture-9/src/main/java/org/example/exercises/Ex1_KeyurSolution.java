package org.example.exercises;

import java.util.Scanner;

public class Ex1_KeyurSolution
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        reverseLetters(enterWord());
    }

    static String enterWord()
    {
        System.out.printf("Please enter a word you would like to reverse: ");
        String word = stdin.nextLine();
        return word;
    }

    //function to reverse the order of characters
    static void reverseLetters(String word)
    {
        char[] wordToArray = word.toCharArray();
        String reversedWord = "";
        for (int i = 0; i < word.length(); i++)
        {
            reversedWord = word.charAt(i) + reversedWord;
        }
        System.out.println(reversedWord);
    }
}