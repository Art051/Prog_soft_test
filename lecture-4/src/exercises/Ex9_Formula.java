package exercises;

import java.util.Scanner;

public class Ex9_Formula
{
    /*
    Given the following formula:
    X = 3*A + 2*B + 4/B
Calculate all values of for A = 0 to 22 and B = 1 to 14
Display the values, except should the value exceed 100 then display “Limit exceeded” instead.
     */

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        int a = 0, b = 1, aMax = 22, bMax = 14;
        double formula = ((3 * a) + (2 * b) + (4 / b));


        while (formula < 100)
        {
            formula = ((3 * a) + (2 * b) + (4 / b));
            System.out.printf("(3 * %d) + (2 * %d) + (4 / %d) = %.2f\n",a ,b, b, formula);
            a++;
            b++;
        }
        System.out.printf("Limit exceeded\n");

    }
}