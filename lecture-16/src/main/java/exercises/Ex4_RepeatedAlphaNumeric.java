package exercises;

import java.util.ArrayList;
import java.util.List;

public class Ex4_RepeatedAlphaNumeric
{
    /*
    Take a sentence, find the first repeated alphanumeric character.
For example, the pangram “The quick brown fox jumps over the lazy dog” should give the value ‘o’, which is the first character to appear for a second time.
This should only match alphanumeric characters, i.e. letters and numbers. Punctuation may be in the input, but should not be matched.
Letters should be matched regardless of their case.
     */

    public static void main(String[] args)
    {
        System.out.println(findFirstRepeatAlphaNum("The quick brown fox jumps over the lazy dog"));
    }

    /**
     * <P>
     *     Takes String input, declares empty List of characters to store each character in the String parameter.
     *     Section after the colon in the for-each loop achieves the following, in order:
     *          String -> make lower case -> replace all non-Alphanumeric characters (using RegEx) with a blank String
     *          -> converts to a char[]
     *     Iterates tough the characters in order using a for-each loop.
     *     If condition:
     *          If the List<Character> contains the current char, then return the string value of the char.
     *          If the List<Character> does not contain the current char, then add the char to the List<Character>.
     *     If the for-each loop reaches the end of the char[] and no duplicate is found,
     *     the loop exits and the method returns "No repeating alphanumeric character found."
     * @param input Random String to check for first repeated AlphaNumeric character.
     * @return Either String representation of first repeating AlphaNumeric character
     *         or String "No repeating alphanumeric character found."
     */
    public static String findFirstRepeatAlphaNum(String input)
    {
        List<Character> uniqueAlphaNums = new ArrayList<>();

        for (char currentChar : input.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray())
        {
            if (uniqueAlphaNums.contains(currentChar))
            {
                return String.valueOf(currentChar);
            }
            uniqueAlphaNums.add(currentChar);
        }
        return "No repeating alphanumeric character found.";
    }
}
