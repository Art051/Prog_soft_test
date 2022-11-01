package extras;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex_3
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
Ask the user to enter five words
Create a sentence from the word within a character array.
The first letter should be uppercase, spaces should be inserted between each word and a full stop added at the end.
Display the final sentence.
         */
        String wordIn;
        int maxEntries = 5;
        ArrayList<String> stringArrayList = new ArrayList<>(maxEntries);
        String newSentence = "";

        for (int i = 0; i < maxEntries; i++)
        {
            System.out.printf("Enter a word: \n");
            wordIn = stdin.nextLine();
            stringArrayList.add(wordIn);
        }

        String firstWord = stringArrayList.get(0);
        String firstLetter = firstWord.substring(0, 1);
        String newFirstWord = firstLetter.toUpperCase().concat(firstWord.substring(1));
        stringArrayList.set(0, newFirstWord);

        for (int i = 0; i < stringArrayList.size(); i++)
        {
            newSentence = newSentence.concat(stringArrayList.get(i)).concat(" ");
        }
        stringArrayList.add(".");

        String output = "";
        for (int i = 0; i < stringArrayList.size() - 1; i++)
        {
            if (i < stringArrayList.size() - 2)
            {
                output = output.concat(stringArrayList.get(i)).concat(" ");
            }
            else
            {
                output = output.concat(stringArrayList.get(i)).concat(".");
            }
        }
        System.out.printf("%s", output);
    }
}
