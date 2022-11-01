package extras;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex_6
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        Allow the user to type in a sentence
        Find the start of each word and change it to an upper case letter.
        Display the new sentence.
        Constraint: Only required to work with single spaces or hypthens that appear between words

Enter sentence: Hello this is a short-term greeting?
Hello This Is A Short-Term Greeting?
Convert char to upper case
char lower = ‘ a’;
char upper;

upper = Character.toUpperCase(lower);
String to Char Array Pattern
Array Counting Loop Pattern
 Array Counting Loop Pattern
      Array Read Pattern
           Array Write Pattern
          (Don’t write off the end of the array)

         */


        String sentenceIn;
        char[] charsIn;

        System.out.printf("Enter a sentence: \n");
        sentenceIn = stdin.nextLine();
        charsIn = sentenceIn.toCharArray();


        charsIn[0] = Character.toUpperCase(charsIn[0]);

        for(int i = 1; i < charsIn.length; i++){
            if(charsIn[i - 1] == 32 || charsIn[i - 1] == 45)
            {
                char currentChar = charsIn[i];
                charsIn[i] = Character.toUpperCase(currentChar);
            }
        }

        String outputString = "";
        for(char character : charsIn){
            outputString = outputString.concat(String.valueOf(character));
        }

        System.out.printf("%s", outputString);
    }
}
