package exercises;

import java.util.Scanner;

public class Ex8_FirstEven
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        /*
        Allow the user to enter 5 values
        Once all the numbers have been entered, search the values to display the first even value found or “None found”
        Enter: 5
        Enter: 6
        ….
        Enter: 4
        First Even Number is 6
         */

        int[] fiveValues = new int[5];

        for (int i = 0; i < fiveValues.length; i++)
        {
            System.out.printf("Enter a value: \n");
            fiveValues[i] = Integer.parseInt(stdin.nextLine());
        }


        boolean found = false;

        for (int i = 0; i < fiveValues.length; i++)
        {
            if (fiveValues[i] % 2 == 0)
            {
                found = true;
                System.out.printf("%d\n", fiveValues[i]);
                break;
            }
        }

        if (!found)
        {
            System.out.printf("None found\n");
        }

    }
}
