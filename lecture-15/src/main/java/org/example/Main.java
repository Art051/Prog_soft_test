package org.example;

import java.util.Arrays;

public class Main
{
    public static void main(String[] args)
    {
//        Lecture 14 : Extra problem solving & JavaDoc learning

//        Exercise 14: Towers of Hanoi

        int[][] hanoiTower = {
                {1, -1, -1, -1},
                {2, -1, -1, -1},
                {3, -1, -1, -1},
                {4, -1, -1, -1},
        };

        for (int[] row : hanoiTower)
        {
            System.out.printf("%s\n", Arrays.toString(row));
        }


        moveAtoC(hanoiTower);
        for (int[] row : hanoiTower)
        {
            System.out.printf("%s\n", Arrays.toString(row));
        }
    }


    public static void moveAtoC(int[][] hanoiTower)
    {
        int colARow = 0, colCRow = 3;
        int temp;
        if (hanoiTower[0][0] != -1)
        {
            for (int i = 0; i < hanoiTower.length; i++)
            {
                for (int j = 3; j > 0; j--)
                {
                    if (hanoiTower[i][colARow] < hanoiTower[3][colCRow])
                    {
                        temp = hanoiTower[3][colCRow];
                        hanoiTower[3][colCRow] = hanoiTower[i][colARow];
                        hanoiTower[i][colARow] = temp;
                        colARow--;
                        colCRow++;
                    }


                }
            }
        }

    }
}