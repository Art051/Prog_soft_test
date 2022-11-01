package org.example;

public class ModelAnswer
{

    public static void main(String[] args)
    {
        for (int i = 0; i <= 999; i++)
        {
            PrintGridNumber(i);
        }
    }

    public static void PrintGridNumber(int num)
    {
        //Break the number up into its constituent digits.
        int[] digits = new int[3];
        digits[2] = GetDigitInPosition(num, 1);
        digits[1] = GetDigitInPosition(num, 2);
        digits[0] = GetDigitInPosition(num, 3);

        //Loop through every possible row to output
        for (int i = 9; i > 0; i--)
        {
            //Check if we output hundreds, tens, units for this row
            for (int j = 0; j < 3; j++)
            {
                //Output * if the digit is exactly or exceeds this row, otherwise a space.
                if (digits[j] > i)
                {
                    System.out.printf("* ");
                }
                else
                {
                    System.out.printf("  ");
                }
            }
            System.out.printf("\n");
        }
        System.out.printf("\n");
    }

    //Position is the position of the digit from the right. 1 = units, 2 = tens, 3 = hundreds etc.
    public static int GetDigitInPosition(int num, int position)
    {
        while (num > Math.pow(10, position) - 1)
        {
            num %= Math.pow(10, position);
        }
        return (int) (num / (Math.pow(10, position) / 10));
    }

}
