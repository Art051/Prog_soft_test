package exercises;

import java.util.Scanner;

public class Ex7_BreakPattern
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        /*
Create a game.
Player one enters a secret number
Player two has three chances to guess this number.
If they succeed they win otherwise they lose and player one wins.
Player one enter secret number: 8383
Player two make a guess: 22
Player two make a guess: 3
Player two make a guess: 8494
Player one has won
Player one enter secret number: 12
Player two make a guess: 34
Player two make a guess: 12
Player two has won

Solution requires:
Counting Loop Pattern
followed by
Condition Loop Pattern
         */

        int playerOneChoice, playerTwoChoice, maxGuesses = 3, guessesRemaining = maxGuesses;

        System.out.printf("Player one, enter a number: \n");
        playerOneChoice = Integer.parseInt(stdin.nextLine());


        while (guessesRemaining >= 0)
        {
            if (guessesRemaining > 0)
            {
                System.out.printf("Player two make a guess: 'n");
                playerTwoChoice = Integer.parseInt(stdin.nextLine());
                if (playerOneChoice == playerTwoChoice)
                {
                    System.out.printf("Player two has won\n");
                    break;
                }
                else
                {
                    guessesRemaining--;
                }

            }
            else
            {
                System.out.printf("Player one has won\n");
                break;

            }
        }
    }
}
