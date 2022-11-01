package extras;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_4
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        //        eightNums();
        tenTwoWords();
    }

    public static void eightNums()
    {
        /*
        The user enters a set of 8 numbers.
        If any of the numbers are 1, 3, 4 or 18, they should be replaced with zeroes.
        Display the new set of numbers
            Array Counting Loop Pattern
             Array Counting Loop Pattern
                  Array Read Pattern
                       Array Write Pattern
         */

        int[] userNums = new int[8];

        for (int i = 0; i < userNums.length; i++)
        {
            System.out.printf("Enter a number: \n");
            userNums[i] = Integer.parseInt(stdin.nextLine());
        }

        System.out.printf("Original numbers: %s\n", Arrays.toString(userNums));

        //first approach, comparing each index manually to the 4 disallowed/replaceable numbers
        for (int i = 0; i < userNums.length; i++)
        {
            if ((userNums[i] == 1) || (userNums[i] == 3) || (userNums[i] == 4) || (userNums[i] == 18))
            {
                userNums[i] = 0;
            }
        }

        // second approach, comparing each index to each disallowed/replaceable number stored as an array
        // allowing for easier changes to the disallowed nums and the count of disallowed nums
        int[] disallowed = {1, 3, 4, 18};

        for (int i = 0; i < userNums.length; i++)
        {
            for (int j : disallowed)
            {
                if (userNums[i] == j)
                {
                    userNums[i] = 0;
                    break;
                }
            }
        }
        System.out.printf("Amended numbers: %s\n", Arrays.toString(userNums));
    }

    public static void tenTwoWords()
    {
        /*
The first user enters a set of 10 words
The second user enters two words
Should either of these words appear in words entered by the first user, then a message should be displayed saying that a matching word has been found
Constraint: only the occurrence of the first match needs to be displayed
Array Counting Loop Pattern
 Array Counting Loop Pattern
      Array Read Pattern
           Break Pattern
     */

        String[] firstUserWords = new String[5];
        String[] guessedWords = new String[2];

        for (int i = 0; i < firstUserWords.length; i++)
        {
            System.out.printf("Enter a word: \n");
            firstUserWords[i] = stdin.nextLine();
        }

        for (int i = 0; i < guessedWords.length; i++)
        {
            System.out.printf("Enter a word to see if it's in the first collection: \n");
            guessedWords[i] = stdin.nextLine();
        }

        boolean found = false;
        for (String initialWord : firstUserWords)
        {
            for (String guess : guessedWords)
            {
                if (initialWord.equals(guess))
                {
                    System.out.printf("Found the word: %s", guess);
                    found = true;
                    break;
                }
            }
            if (found)
            {
                break;
            }
        }
        if (!found)
        {
            System.out.printf("Failed to find a matching word!");
        }
    }
}
