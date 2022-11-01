package exercises;

import java.util.Scanner;

public class Ex8_MultiplicationTables
{
    /*
    Display the multiplication table for two numbers entered by the user, the first being the multiplier and the second being the multiplicand at which to stop.

    Enter first number: 3
    Enter second number: 5
    1 x 3 = 3
    2 x 3 = 6
    3 x 3 = 9
    4 x 3 = 12
    5 x 3 = 15
     */

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        int multiplicand, multiplier;

        System.out.printf("Enter first number: \n");
        multiplicand = Integer.parseInt(stdin.nextLine());
        System.out.printf("Enter second number: \n");
        multiplier = Integer.parseInt(stdin.nextLine());


        for (int i = 1; i <= multiplier; i++)
        {
            System.out.printf("%d X %d = %d\n", i, multiplicand, i * multiplicand);
        }
    }
}
