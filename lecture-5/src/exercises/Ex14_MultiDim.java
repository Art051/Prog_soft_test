package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex14_MultiDim
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        //        fiveSixArray();
//        fiftySixNums();
//        floatNums();
        userDefineTable();
    }

    public static void fiveSixArray()
    {
        // An array of 5x6 strings
        String[][] array = new String[5][6];

        String xMark = "X";
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = xMark;
            }
        }
        System.out.printf(Arrays.deepToString(array));
    }

    public static void fiftySixNums()
    {
        // An array of 7x56 whole numbers

        int[][] array = new int[7][56];

        int currentnum = 1;
        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = currentnum;
                currentnum++;
            }
        }
        System.out.printf(Arrays.deepToString(array));
    }

    public static void floatNums()
    {
        //        An array of 22x42 floating point numbers
        double[][] array = new double[22][42];

        double currentnum = 1.4;

        for (int i = 0; i < array.length; i++)
        {
            for (int j = 0; j < array[i].length; j++)
            {
                array[i][j] = currentnum;
                currentnum /= 10;
            }
        }
        System.out.printf(Arrays.deepToString(array));
    }

    public static void userDefineTable()
    {
        //Allow the user to enter the number of rows and columns for a table and create an array large enough to store it

        int rows, columns;
        int[][] userArray;

        System.out.printf("Row count: \n");
        rows = Integer.parseInt(stdin.nextLine());
        System.out.printf("Column count: \n");
        columns = Integer.parseInt(stdin.nextLine());

        userArray = new int[rows][columns];

        System.out.printf(Arrays.deepToString(userArray));
    }
}
