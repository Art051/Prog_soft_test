package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex8_ReturnTypeAndArgs
{

    private static final Scanner stdin = new Scanner(System.in);
    private static final Random rng = new Random();


    public static void main(String[] args)
    {
        // Create the following functions (with arguments) and write the code to call them and display the results.
        System.out.printf("%d\n", addThreeNumbers(1, 3, 5));
        System.out.printf("%.2f\n", divide(10, 0));
        System.out.printf("%.2f\n", divide(10, 3));
        System.out.printf("%.2f\n", calcDiscountPrice(250, 12.3324));
        System.out.printf(areEqual(1, 2) + "\n");
        System.out.printf(areEqual(1, 1) + "\n");
        System.out.printf(isInRange(40) + "\n");
        System.out.printf(isInRange(1) + "\n");
        System.out.printf(isInRange(3) + "\n");
        System.out.printf(isInRange(20) + "\n");
        System.out.printf(isInRange(68) + "\n");
        System.out.printf(isInRange(69) + "\n");
        System.out.printf(checkNumbers(new int[] {1,2,3,4,5},5, 2) + "\n");
        System.out.printf(checkNumbers(new int[] {1,2,3,4,5},5, 0) + "\n");
        System.out.printf(checkNumbers(new int[] {1,2,3,4,5},5, 6) + "\n");

    }

    //    Pass in three whole numbers, sum them and return result
    public static int addThreeNumbers(int first, int second, int third)
    {
        return (first + second + third);
    }


    //    Pass in two numbers divide them and return result. Prevent error caused by dividing by zero and return zero instead. Both numbers must be positive.
    public static double divide(double first, double second)
    {
        if (second == 0)
        {
            return 0;
        }
        return (first / second);

    }

    //    Pass in price and percentage, calculate discounted price e.g. given price = £20 and discount = 5.2%, result is £18.96
    public static double calcDiscountPrice(double price, double percentage)
    {
        return (price - (price * percentage));
    }

    //    Pass in two whole numbers, if the numbers are equal return true
    public static boolean areEqual(int first, int second)
    {
        return first == second;

    }

    //    Pass in decimal number, if the number is within the range 3 to 68 inclusive then return true.  -  Overlap Test
    public static boolean isInRange(double numInput)
    {
        return ((numInput >= 0) && (numInput <= 68));

    }

    //    Pass in an array of whole numbers, the length of array and a “match” value. Return true, if the array contains the value.  --  Array Search Pattern
    public static boolean checkNumbers(int[] wholeNumArr, int arrLength, int matchValue)
    {
        for (int i = 0; i < arrLength; i++)
        {
            if (wholeNumArr[i] == matchValue)
            {
                return true;
            }
        }
        return false;
    }


}
