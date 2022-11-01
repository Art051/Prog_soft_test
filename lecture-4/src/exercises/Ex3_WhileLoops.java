package exercises;

import java.util.Scanner;

public class Ex3_WhileLoops
{
    public static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        //        yesToStop();
        //        priceToCostEndsHundred();
        calculator();
    }

    public static void yesToStop()
    {

        /*
        The user must enter “yes” to stop the loop.Enter number: 2Number x 5 = 10Exit ? noEnter number: 3Number x 5 = 15Exit ? yesFinished!!
         */
        boolean stop = false;

        while (!stop)
        {
            double numberInput;
            System.out.printf("Enter a number: \n");
            numberInput = Double.parseDouble(stdin.nextLine());
            System.out.printf("%f X 5 = %f\n", numberInput, numberInput * 5);
            System.out.printf("Exit?\n");
            stop = stdin.nextLine().equalsIgnoreCase("yes");
        }
        System.out.printf("Finished!\n");
    }

    public static void priceToCostEndsHundred()
    {
        /*
        User provides product prices and program calculates the total cost.
        Stop calculating when total cost exceeds £100
        Product price £:2.99Product price £:80.22Product price £:50.00Total is £133.21
         */

        double cumulativeTotal = 0.00;

        while (cumulativeTotal < 100.00)
        {
            System.out.printf("Product price £: ");
            double productPrice = Double.parseDouble(stdin.nextLine());
            cumulativeTotal += productPrice;
        }

        System.out.printf("Total is £%.2f", cumulativeTotal);

    }

    public static void calculator()
    {

        /*
        Build a simple calculator that exits when user finishes their calculations and displays result
        1. Add, 2. Subtract, 3. Exit
        Select option: 1
        Enter number: 2
        1. Add, 2. Subtract, 3. Exit
        Select option: 1
        Enter number: 6
        1. Add, 2. Subtract, 3. Exit
        Select option: 2Enter number: 3
        1. Add, 2. Subtract, 3. Exit
        Select option: 3
        Result is 5
         */

        int option = 0;
        boolean exit = false;

        double currentNum, currentTotal = 0;

        while (!exit)
        {
            System.out.printf("1. Add, 2. Subtract, 3. Exit\n");
            System.out.printf("Select Option: \n");
            option = Integer.parseInt(stdin.nextLine());
            if (option == 3)
            {
                break;
            }
            else
            {
                System.out.printf("Enter Number: \n");
                currentNum = Double.parseDouble(stdin.nextLine());
                if (option == 1)
                {
                    currentTotal += currentNum;
                }
                else if (option == 2)
                {
                    currentTotal -= currentNum;
                }
            }
        }
        System.out.printf("Result is %.2f", currentTotal);
    }
}
