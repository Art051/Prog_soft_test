package exercises;

import java.util.Scanner;

public class Ex5_ReverseOrder
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        Using the array write and read patterns together:

        Create an array to containing six numbers entered by the user.
        Reverse the contents of the array and display the contents.
        You will need three swaps

        FROM THIS      TO THIS
        0:A             F
        1:B             E
        2:C             D
        3:D             C
        4:E             B
        5:F             A
         */

        String[] aToFArray = {"A", "B", "C", "D", "E", "F"};

        System.out.printf("Original order: \n");
        for (String letter : aToFArray)
        {
            System.out.printf("%s\n", letter);
        }

        for (int i = 0; i < aToFArray.length / 2; i++)
        {
            String temp = aToFArray[i];
            aToFArray[i] = aToFArray[aToFArray.length - i - 1];
            aToFArray[aToFArray.length - i - 1] = temp;
        }

        System.out.printf("New order: \n");
        for (String letter : aToFArray)
        {
            System.out.printf("%s\n", letter);
        }

    }
}
