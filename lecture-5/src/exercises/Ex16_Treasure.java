package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex16_Treasure
{
    private static Scanner stdin = new Scanner(System.in);
    private static Random rand = new Random();

    public static void main(String[] args)
    {

        treasureHunt();
    }

    public static void treasureHunt()
    {
/*
Build a Treasure Hunt Game
Build a 5x5 map
Clear the map so that all the grid locations are initially set to 0
Randomly choose one of the cell locations and put a value of 1 in it, that represents the treasure
Allow the player to guess where the treasure is
*/

        int[][] map = new int[5][5];
        int xAxis, yAxis, xGuess, yGuess;

        for (int[] row : map)
        {
            for (int cell : row)
            {
                cell = 0;
            }
        }

        xAxis = rand.nextInt(0, 5);
        yAxis = rand.nextInt(0, 5);

        map[xAxis][yAxis] = 1;

        int guesses = 0;

        boolean found = false;
        while (!found)
        {
            System.out.printf("Guess the row: \n");
            xGuess = Integer.parseInt(stdin.nextLine());
            System.out.printf("Guess the column: \n");
            yGuess = Integer.parseInt(stdin.nextLine());

            guesses++;
            if (map[xGuess][yGuess] == 1)
            {
                System.out.printf("Correct! It took %d guesses\n", guesses);
                found = true;
            }
            else
            {
                System.out.printf("Nope\n");
            }
        }

        //EXTRA: Display the number of guesses they took to find it


    }
}