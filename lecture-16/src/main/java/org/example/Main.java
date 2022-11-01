package org.example;

public class Main
{
    public static void main(String[] args)
    {
        int[][] towers = buildInitialTowers(5);
        printTowers(towers);
        int steps = 0;
        do
        {
            makeValidMove(towers[0], towers[1]);
            printTowers(towers);

            makeValidMove(towers[0], towers[2]);
            printTowers(towers);

            makeValidMove(towers[1], towers[2]);
            printTowers(towers);
            steps += 3;
        }
        while (!puzzleComplete(towers[2]));

        System.out.printf("%s\n", "Puzzles complete!");
        printTowers(towers);
        System.out.printf("Puzzle complete after %d steps: ", steps);
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
    public static int[][] buildInitialTowers(final int numberOfDisks)
    {
        int[][] towers = new int[3][numberOfDisks];
        towers[0] = buildPopulatedStartTower(numberOfDisks);
        towers[1] = buildUnpopulatedTower(numberOfDisks);
        towers[2] = buildUnpopulatedTower(numberOfDisks);
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

        return tower;
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

    /**
     * Get the top value in a specified tower.
     * <P>
     * This function takes a tower and finds the top value which is not -1. This returns MAX INT when
     * the tower is empty
     * @param tower the tower  to check.
     * @return the top value found.
     */
    public static int getTopOfTowerValue(int[] tower)
    {
        int indexAtTopOfTower = getTopEmptyIndex(tower) + 1;

        //check if tower is empty
        if (indexAtTopOfTower >= tower.length)
        {
            return Integer.MAX_VALUE;
        }
        return tower[indexAtTopOfTower];
    }

    public static void moveTopValue(int[] towerMoveTo, int[] towerMoveFrom)
    {
        //Find value at the top of the tower being moved from
        int moveFromValue = getTopOfTowerValue(towerMoveFrom);

        if (moveFromValue == Integer.MAX_VALUE)
        {
            return;
        }

        //Set value of tower moving from to -1
        towerMoveTo[getTopEmptyIndex(towerMoveTo)] = moveFromValue;

        //Set value of tower moving to, to the value from the tower being moved from
        towerMoveFrom[getTopEmptyIndex(towerMoveFrom) + 1] = -1;
    }

    public static void makeValidMove(int[] tower1, int[] tower2)
    {
        if (getTopOfTowerValue(tower1) < getTopOfTowerValue(tower2))
        {
            moveTopValue(tower2, tower1);
        }
        else
        {
            moveTopValue(tower1, tower2);
        }
    }

    public static boolean puzzleComplete(int[] towerC)
    {
        for (int i = 0; i < towerC.length; i++)
        {
            if (!(towerC[i] == i + 1))
            {
                return false;
            }
        }
        return true;
    }
}