package extras;

import java.util.Arrays;
import java.util.Scanner;

public class Ex_10
{
    /*
    Move the lowest value in an array of numbers until it reaches the bottom of the array (last element)
    Constraint: the other numbers in the array may become mixed up

    22|4|56|3|5|67    BECOMES    22|56|4|5|67|3

    pos1|pos2|swap?
     0  | 1  | N
     1  | 2  | Y
     2  | 3  | N
     3  | 4  | Y
     4  | 5  | Y

    Array Counting Loop Pattern
     Branch Pattern
          Array Swap Pattern
     */
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] inputArray = populateIntArray(5);
        int[] smallestAtEnd = moveSmallestToEnd(inputArray);
        printArraySmallestAtEnd(smallestAtEnd);
    }

    public static int readString(String prompt)
    {
        System.out.printf("%s", prompt);
        return Integer.parseInt(stdin.nextLine());
    }

    public static int[] populateIntArray(int maxSize)
    {
        int[] originalIntArray = new int[maxSize];

        for (int i = 0; i < maxSize; i++)
        {
            originalIntArray[i] = readString("Enter a number: ");
        }
        return originalIntArray;
    }

    public static int[] moveSmallestToEnd(int[] originalIntArray)
    {
        int[] smallestAtEndArray = originalIntArray;
        int currIndex = 1, temp;

//        System.out.printf("%s\n", Arrays.toString(smallestAtEndArray));     //  Uncomment this to see the original array

        for (int i = 0; i < smallestAtEndArray.length - 1; i++)
        {
            if (smallestAtEndArray[i] < smallestAtEndArray[currIndex])
            {
                temp = smallestAtEndArray[currIndex];
                smallestAtEndArray[currIndex] = smallestAtEndArray[i];
                smallestAtEndArray[i] = temp;
                currIndex++;
            }
//            System.out.printf("%s\n", Arrays.toString(smallestAtEndArray));     //  Uncomment this to see the incremental changes to the array at  the end of each loop
        }
        return smallestAtEndArray;
    }

    public static void printArraySmallestAtEnd(int[] smallestAtEndArray)
    {
        System.out.printf("%s", Arrays.toString(smallestAtEndArray));
    }
}