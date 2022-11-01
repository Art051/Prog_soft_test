package exercises;

import java.util.Scanner;

public class Ex10_GuessNums
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        Create a game
        The first player enters 8 numbers
        Once all the first player has finished, the second player has to one attempt guess one of these numbers
        Print “You have won” or “You have lost”

        Player 1 enter numbers now
        Enter Number: 1
        Enter Number: 34
        ….
        Enter Number: 88
        Player 2 make a guess: 34
        You have won
         */

        int[] firstUserNums = new int[8];
        int secondUserGuess;

        for (int i = 0; i < firstUserNums.length; i++)
        {
            System.out.printf("Enter Number: \n");
            firstUserNums[i] = Integer.parseInt(stdin.nextLine());
        }

        System.out.printf("Player 2 make a guess: \n");
        secondUserGuess = Integer.parseInt(stdin.nextLine());

        boolean found = false;

        for (int number : firstUserNums)
        {
            if (number == secondUserGuess)
            {
                found = true;
                System.out.printf("You have won\n");
                break;
            }
        }

        if (!found)
        {
            System.out.printf("You have lost\n");
        }


    }
}
