package extras;

import java.util.Scanner;

public class Ex_8
{
    /*
    Reverse the contents of an arbitrary length array of strings
    0,1,2,3,4,5    BECOMES     0,1,2,3,4,5
    a,b,c,d,e,f                f,e,d,c,b,a
        Hint: If the length is an odd value, the middle array element remains unchanged and doesn’t contribute to the number of pairs to be swapped
        i.e. a length of both 4 and 5 require 2 swaps
*/
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        System.out.printf("Enter a string: ");
        String inputWord = stdin.nextLine();

        char[] inputChars = inputWord.toCharArray();

        int current = 0, next = (inputChars.length - 1), numSwaps = inputChars.length / 2;
        char temp;
        for (int i = 0; i < numSwaps; i++)
        {
            temp = inputChars[current];
            inputChars[current] = inputChars[next];
            inputChars[next] = temp;
            current++;
            next--;
        }

        String newString = "";

        for (char character : inputChars)
        {
            newString = newString.concat(String.valueOf(character));
        }
        System.out.printf("Swapped string: %s", newString);
    }
}
