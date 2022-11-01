package exercises;

import java.util.Scanner;

public class Ex4_WriteRead
{

    /*
    Using the array write and read patterns together:
Create an array to containing two values entered by the user.
Swap the values contained in the array
Display the contents of the array


Create an array to contains the values “One”, “Two” and “Three”
Reverse the contents of the array, so the first array element now contains “Three” and the last contains “One”
     */

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        twoValsSwapped();
        reverseContents();

    }

    public static void twoValsSwapped()
    {

        int[] values = new int[2];
        int temp;

        for (int i = 0; i < values.length; i++)
        {
            System.out.printf("Enter a value: \n");
            values[i] = Integer.parseInt(stdin.nextLine());
        }

        System.out.printf("Original order: \n");
        for (int value : values)
        {
            System.out.printf("%d\n", value);
        }

        temp = values[0];
        values[0] = values[1];
        values[1] = temp;

        System.out.printf("New order: \n");
        for (int value : values)
        {
            System.out.printf("%d\n", value);
        }
    }

    public static void reverseContents()
    {

        String[] threeStrings = {"One", "Two", "Three"};

        System.out.printf("Original order: \n");
        for (String number : threeStrings)
        {
            System.out.printf("%s\n", number);
        }

        for (int i = 0; i < threeStrings.length / 2; i++)
        {
            String temp = threeStrings[i];
            threeStrings[i] = threeStrings[threeStrings.length - i - 1];
            threeStrings[threeStrings.length - i - 1] = temp;
        }

        System.out.printf("New order: \n");
        for (String number : threeStrings)
        {
            System.out.printf("%s\n", number);
        }
    }
}
