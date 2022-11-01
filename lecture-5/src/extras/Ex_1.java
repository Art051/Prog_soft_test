package extras;

import java.util.Scanner;

public class Ex_1
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        int[] sixIn = new int[6];

        for (int i = 0; i < sixIn.length; i++)
        {
            System.out.printf("Enter a number: \n");
            sixIn[i] = Integer.parseInt(stdin.nextLine());
        }

        for (int digit : sixIn)
        {
            if (digit % 2 == 0)
            {
                System.out.printf("%d", digit);
            }
        }
    }
}
