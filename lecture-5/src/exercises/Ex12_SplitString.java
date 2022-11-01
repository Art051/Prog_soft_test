package exercises;

import java.util.Scanner;

public class Ex12_SplitString
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        To split a string value you can use the Split() function shown at the bottom of the slide. This splits it into a string array using the spaces to subdivide it.
string[ ]  arrayName;
string stringValue = “One Two Three”;
int length;
arrayName = stringVariable.split(“Δ“); ----- Δ = space
length = arrayName.length;  <-- How many parts?
Write some code to test this and display the contents of the array
         */

        String[] loremArray;
        String stringValue = getLorem();
        int length;
        loremArray = stringValue.split(" ");
        length = loremArray.length;
        System.out.printf("There are %d words", length);

    }

    private static String getLorem()
    {
        return "Lorem ipsum dolor sit amet. Eum veritatis modi nam obcaecati omnis ut ducimus velit aut quaerat enim ut consequatur repudiandae qui optio atque? 33 doloremque temporibus sed Quis fugiat ut veniam nisi ab veniam dolorem. \n";
    }
}