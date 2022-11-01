package exercises;

import java.util.Scanner;

public class Ex1_ForLoop
{
    public static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        //        displayZerotoTwo();
        //        displayFSFE();
        //        sixTimesTable();
        performThreeAdditions();

    }

    public static void displayZerotoTwo()
    {

        // Display:Number 0Number 1Number 2
        for (int i = 0; i < 3; i++)
        {
            System.out.printf("Number %d\n", i);
        }
    }

    public static void displayFSFE()
    {
        // Display: Number 56Number 57Number 58
        for (int i = 56; i < 59; i++)
        {
            System.out.printf("Number %d\n", i);
        }
    }

    public static void sixTimesTable()
    {
        //display 6 times table from 1 to 10 in format: 1 x 6 = 6
        for (int i = 1; i < 11; i++)
        {
            System.out.printf("%d x %d = %d\n", i, 6, i * 6);
        }
    }

    public static void performThreeAdditions()
    {
        for (int i = 0; i < 3; i++)
        {
            int previousInput = 0, currentInput = 0;
            for (int j = 1; j < 3; j++)
            {
                previousInput = currentInput;
                System.out.printf("Enter number %d: \n", j);
                currentInput = Integer.parseInt(stdin.nextLine());
            }
            int total = previousInput * currentInput;
            System.out.printf("Result is %d\n", total);
        }
    }

}
