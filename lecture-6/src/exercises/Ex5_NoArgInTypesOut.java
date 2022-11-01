package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex5_NoArgInTypesOut
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {
        //    Create the following functions (no arguments) and write the code to call them and display the results.

        System.out.printf("%s\n", readName());
        System.out.printf("%f\n", readPrice());
        System.out.printf("%s\n", readMessage());

    }

    //    Prompt user with a message asking them to enter name and return it
    public static String readName()
    {
        String userName;
        System.out.printf("Enter your name: \n");
        userName = stdin.nextLine();

        return userName;
    }

    //    Read price entered by user. If the value is negative return a value of zero.
    public static double readPrice()
    {
        double priceIn;
        System.out.printf("Enter a price: \n");
        priceIn = Double.parseDouble(stdin.nextLine());

        if (priceIn < 0)
        {
            return 0;
        }

        return priceIn;
    }

    //    Read name and message entered by user.
    //    Return message string
    //    “Hello user message was message text here”
    public static String readMessage()
    {
        String userMessage;
        System.out.printf("Enter a message: \n");
        userMessage = stdin.nextLine();
        return String.format("Hello user message was %s", userMessage);
    }
}
