package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex1_DisplayText
{
    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {

        //Display “Hello” then “Goodbye”
        // Display “Hello Bob”
        //Display “One” “Two” “Three” in this order

        printBob();
        displayHello();
        displayGoodbye();
        displayOne();
        displayTwo();
        displayThree();
    }


    public static void printBob()
    {
        System.out.printf("Hello Bob");
    }

    public static void displayHello()
    {
        System.out.printf("Hello");
    }

    public static void displayGoodbye()
    {
        System.out.printf("Goodbye");
    }


    public static void displayTwo()
    {
        System.out.printf("Two");
    }

    public static void displayThree()
    {
        System.out.printf("Three");
    }

    public static void displayOne()
    {
        System.out.printf("One");
    }

}
