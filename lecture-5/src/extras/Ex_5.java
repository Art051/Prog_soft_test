package extras;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_5
{
    private static Scanner stdin = new Scanner(System.in);

    /*
    Allow the user to type in a sentence
    Search the sentence for the letters A, G and K
    Display the index position at which these letters were found, with first letter at index 0

    Enter sentence: Apples are Good
    Letter A at position 0
    Letter G at position 10
    String to Char Array Pattern

    Array Counting Loop Pattern
     Array Counting Loop Pattern
          Array Read Pattern

     */

    public static void main(String[] args)
    {
        String sentenceIn;
        char[] inputToChars;

        System.out.printf("Enter a sentence: \n");
        sentenceIn = stdin.nextLine();

        inputToChars = sentenceIn.toCharArray();

        for(int i = 0; i < inputToChars.length; i++){
            if(inputToChars[i] == 'A' || inputToChars[i] == 'K' || inputToChars[i] == 'G'){
                System.out.printf("Character %c found at position %d\n", inputToChars[i], i);
            }
        }
    }
}
