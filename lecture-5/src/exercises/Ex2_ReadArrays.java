package exercises;

import java.util.Scanner;

public class Ex2_ReadArrays
{


    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        readFirstLast();
        countPlants();
    }

    public static void readFirstLast()
    {
        /*
        Read the first and last values
type[] cost;    // 3 prices reqd
Create array
User enters array values
totalCost = cost[?];
totalCost = totalCost + cost[?];
totalCost = totalCost + cost[?];
         */
        double[] cost = new double[3];

        double totalCost = 0;
        for (int i = 0; i < cost.length; i++)
        {
            System.out.printf("Enter value %d: \n", i + 1);
            cost[i] = Double.parseDouble(stdin.nextLine());
            totalCost += cost[i];
            System.out.printf("Total cost: %.2f\n", totalCost);
        }

    }

    public static void countPlants()
    {

        /*
        Create array
        User enters array values
        totalPlants = numOfPlants[?] -- first
        		+ …… as required
        				+ numPlants[4];  -  last
         */
        int[] numOfPlants = new int[4];

        double totalCost = 0;
        for (int i = 0; i < numOfPlants.length; i++)
        {
            System.out.printf("Enter value %d: \n", i + 1);
            numOfPlants[i] = Integer.parseInt(stdin.nextLine());
            totalCost += numOfPlants[i];
            System.out.printf("Total cost: %.2f\n", totalCost);
        }

    }
}