package exercises;

import java.util.Scanner;

public class Ex11_GuessThreeLives
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
        Create a game
        The first player enters 8 numbers
        The second player has 3 lives to guess one of these numbers
        You will also need to end the game if the player guesses correctly i.e. they should not be asked to guess again once they win
         */

        int[] firstUserNums = new int[8];
        int secondUserGuess, lives = 3;

        for (int i = 0; i < firstUserNums.length; i++)
        {
            System.out.printf("Enter Number: \n");
            firstUserNums[i] = Integer.parseInt(stdin.nextLine());
        }

        boolean player2Win = false;
        while (lives > 0)
        {
            System.out.printf("Player 2 make a guess: \n");
            secondUserGuess = Integer.parseInt(stdin.nextLine());

            for (int i = 0; i < firstUserNums.length; i++)
            {
                if (secondUserGuess == firstUserNums[i])
                {
                    System.out.printf("Player 2 wins");
                    player2Win = true;
                    break;
                }
            }
            if (player2Win)
            {
                break;
            }
            else
            {
                lives--;
            }
            if ((lives == 0))
            {
                System.out.printf("Player 1 wins");
            }
        }
    }
}
