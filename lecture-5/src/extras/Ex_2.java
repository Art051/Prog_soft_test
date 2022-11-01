package extras;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_2
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        easierWay();
        /*
        Ask the user to enter a sentence
Replace all space characters with ‘*’ (star) characters instead.
Display the final string.
“The brown cow” becomes “The*brown*cow”

String to Char Array Pattern
followed by
Array Counting Loop Pattern
Array Write Pattern
         */
/*
        String userString;
        char[] userChars;
        String[] newArray;
        String newString = "";


        System.out.printf("Enter a sentence: \n");
        userString = stdin.nextLine();
        userChars = userString.toCharArray();
        for(int i = 0; i < userChars.length; i++){
            if(userChars[i] == ' '){
                userChars[i] = '*';
            }
        }
        newArray = new String[userChars.length];

        for(int i = 0; i < userChars.length; i++){
            String charAsString = String.valueOf(userChars[i]);
            newArray[i] = charAsString;
        }

        for(String word : newArray){
            newString = newString.concat(word);
        }

        System.out.printf("%s", newString);
*/
    }

    public static void easierWay()
    {
        System.out.printf("Enter a sentence: \n");
        String userString = stdin.nextLine();
        System.out.printf("%s", userString.replaceAll(" ", "*"));
    }
}
