package org.example;

import java.util.Arrays;

public class ModelAns
{
    public static void main(String[] args)
    {
        buildInitialTower(4);
        printTowers(buildInitialTower(4));
        printTowersSideways(buildInitialTower(4));

    }

    /**
     * Builds the towers of Hanoi in their initial position
     * <p>
     * This will populate tower 'A' (index 0) with incrementing values from 1, and both other towers filled with -1.
     *
     * @param numberOfDisks the number of disks in the tower
     * @return 2D array indexed with the outer dimension representing the number of towers, the inner dimension representing
     * the number of blocks on each tower
     */
    public static int[][] buildInitialTower(final int numberOfDisks)
    {
        int[][] towers = new int[3][numberOfDisks];
        towers[0] = buildPopulatedStartTower(numberOfDisks);
        towers[1] = buildPopulatedStartTower(numberOfDisks);
        towers[2] = buildPopulatedStartTower(numberOfDisks);
        return towers;
    }

    public static int[] buildPopulatedStartTower(final int numberOfDisks)
    {
        int[] tower = new int[numberOfDisks];

        for (int i = 0; i < numberOfDisks; i++)
        {
            tower[i] = i + 1;
        }
        return tower;
    }

    public static int[] buildUnpopulatedTower(final int numberOfDisks)
    {
        int[] tower = new int[numberOfDisks];
        for (int i = 0; i < numberOfDisks; i++)
        {
            tower[i] = -1;
        }

        return new int[0];
    }


    public static void printTowersSideways(int[][] towers)
    {
        Arrays.stream(towers).forEach(row -> System.out.println(Arrays.toString(row)));
    }

    public static void printTowers(int[][] towers)
    {
        for (int i = 0; i < towers[0].length; i++)
        {
            for (int j = 0; j < towers.length; j++)
            {
                System.out.printf("%d\t", towers[j][i]);
            }
            System.out.printf("\n");
        }
        System.out.printf("--------------\n");
    }

    /**
     * Take a tower and find the first empty space, returning the index
     * <p>
     * Takes a 2D array representing a tower, this function looks through the tower to find the first index which can
     * be written to. This returns -1 if the tower is full.
     *
     * @param tower the 1D array to fin the first empty index of.
     * @return the first empty index. This is -1 if the tower is full.
     */
    public static int getTopEmptyIndex(int[] tower)
    {
        for (int i = 0; i < tower.length; i++)
        {
            if (tower[i] != -1)
            {
                return i - 1;
            }
        }
        // If we reach this point, all tower values are -1, Return  the bottom value
        return tower.length - 1;
    }

    public static int getTopOfTowerValues(int[] tower)
    {
        int indexAtTopOfTower = getTopEmptyIndex(tower) + 1;

        //check if tower is empty
        if (indexAtTopOfTower >= tower.length)
        {
            return Integer.MAX_VALUE;
        }
        return tower[indexAtTopOfTower];
    }
}
