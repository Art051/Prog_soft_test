package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex13_Weather
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        Allow the user to type in a sentence e.g.
        “The weather today is fine”

        Split the sentence into separate words
        Print the same sentence with the words reversed e.g. “fine is today weather The”
        Hint: You can add strings together to create one big string, we call this concatenation
         */


        String[] loremArray;
        String stringValue = getLorem();
        loremArray = stringValue.split(" ");
        String reverse = "";

        System.out.printf(Arrays.toString(loremArray));

        for (int i = loremArray.length - 1; i > 0; i--)
        {
            reverse = reverse.concat(loremArray[i]).concat(" ");
        }

        System.out.printf(reverse);
    }

    private static String getLorem()
    {
        return "Lorem ipsum dolor sit amet. Eum veritatis modi nam obcaecati omnis ut ducimus velit aut quaerat enim ut consequatur repudiandae qui optio atque? 33 doloremque temporibus sed Quis fugiat ut veniam nisi ab veniam dolorem. \n";
    }
}
