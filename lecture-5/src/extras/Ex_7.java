package extras;

import java.util.Scanner;

public class Ex_7
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        The first user enters a word of any length and the program creates a password from it
        The program creates the password by switching pairs of characters

COMPUTERS
Becomes
OCPMTURES

String to Char Array Pattern
Rearrange Array Pattern
         */

        System.out.printf("Enter a word: ");
        String inputWord = stdin.nextLine();

        char[] inputChars = inputWord.toCharArray();

        int current = 0, next = 1, numSwaps = inputChars.length / 2;
        char temp;
        for (int i = 0; i < numSwaps; i++)
        {
            temp = inputChars[current];
            inputChars[current] = inputChars[next];
            inputChars[next] = temp;
            current += 2;
            next += 2;
        }

        String newString = "";

        for (char character : inputChars)
        {
            newString = newString.concat(String.valueOf(character));
        }
        System.out.printf("%s", newString);
    }
}
