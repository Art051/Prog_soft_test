package exercises;

import java.util.Scanner;

public class Ex6_CountingLoop
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        //                printWholeNumsOrigOrder();
//        tenWords();
        sevenPrices();
    }

    public static void printWholeNumsOrigOrder()
    {

                /*
        Store an array of 5 whole numbers entered by the user
        After they have all been entered print the numbers in the order they were entered
         */

        int[] fiveWholeNumArray = new int[5];

        for (int i = 0; i < fiveWholeNumArray.length; i++)
        {
            System.out.printf("Enter a whole number: \n");
            fiveWholeNumArray[i] = Integer.parseInt(stdin.nextLine());
        }

        for (int number : fiveWholeNumArray)
        {
            System.out.printf("%d\n", number);
        }
    }

    private static void tenWords()
    {
        /*
        Store an array of 10 words entered by the user
        After they have all been entered print the words in the order they were entered.
         */

        String[] tenWords = new String[10];

        for (int i = 0; i < tenWords.length; i++)
        {
            System.out.printf("Please enter a word: \n");
            tenWords[i] = stdin.nextLine();
        }

        for (String word : tenWords)
        {
            System.out.printf("%s\n", word);
        }
    }

    private static void sevenPrices()
    {

        //        Ask the user to enter 7 prices.Once all the prices have been entered, display them all and the total cost.
        double[] prices = new double[7];
        double total = 0;

        for (int i = 0; i < prices.length; i++)
        {
            System.out.printf("Please enter a price: \n");
            prices[i] = Double.parseDouble(stdin.nextLine());
            total += prices[i];
        }

        for (double word : prices)
        {
            System.out.printf("%s\n", word);
        }
        System.out.printf("%.2f", total);
    }
}
