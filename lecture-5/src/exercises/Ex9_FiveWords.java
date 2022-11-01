package exercises;

import java.util.Scanner;

public class Ex9_FiveWords
{
    /*
    Allow the user to enter 5 words
    A second user can the search for a word that was previously entered and print out “found it” or “not found”
    Enter word: Dog
    Enter word: Cat
    ……
    Enter word: Apple
    Find word: Cat
    Found it
     */


    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        String[] firstUserWords = new String[5];
        String userTwoSearch;


        for (int i = 0; i < firstUserWords.length; i++)
        {
            System.out.printf("Enter a word: \n");
            firstUserWords[i] = stdin.nextLine();
        }

        System.out.printf("Find word: \n");
        userTwoSearch = stdin.nextLine();

        boolean found = false;

        for (int i = 0; i < firstUserWords.length; i++)
        {
            if (firstUserWords[i].equals(userTwoSearch))
            {
                found = true;
                System.out.printf("Found it\n");
                break;
            }
        }

        if (!found)
        {
            System.out.printf("Not found\n");
        }

    }
}
