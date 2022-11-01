package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex3_WithArgs
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {
        //        Create the following procedures (with arguments) and write the code to call them.

        displayNumber(5);
        displayDivisionResult(8764, 2);
        displayCountdown(35);
        readNumber("Enter a number: \n");

    }


    public static void displayNumber(int number)
    {
        System.out.printf("%d\n", number);
    }

    //            Divide one number by another and display result
    public static void displayDivisionResult(double dividend, double divisor)
    {
        System.out.printf("%.2f\n", (dividend / divisor));

    }

    //            Pass in a starting count value then display the countdown from the start value to 1 e.g. start value provided is 4, display the numbers 4,3,2 and 1
    public static void displayCountdown(int startNum)
    {
        for (int i = startNum; i > 0; i--)
        {
            System.out.printf("%d\n", i);
        }
    }

    // void readNumber(args)
    // Pass in a prompt message that can be used to request the user enter a number. Display the prompt message, read a number entered by the user and then display it e.g.
    // Prompt message
    // Enter a number > 12
    // You entered the number 12

    public static void readNumber(String prompt)
    {
        int numInput;
        System.out.printf("%s", prompt);
        numInput = Integer.parseInt(stdin.nextLine());
        System.out.printf("You  entered the number %d\n", numInput);
    }
}
