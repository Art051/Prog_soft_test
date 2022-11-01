package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex15_White
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
//        whiteArray();
        timesTable();
    }

    public static void whiteArray()
    {
        //    Fill an entire 5x7 with the word "White"
        String[][] whiteArray = new String[5][7];

        for (int i = 0; i < whiteArray.length; i++)
        {
            for (int j = 0; j < whiteArray[i].length; j++)
            {
                whiteArray[i][j] = "White";
            }
        }
            System.out.printf(Arrays.deepToString(whiteArray));

    }

    public static void timesTable()
    {
        //        Allow the user to enter the number of columns and rows in of the array, and build a multiplication table e.g. if they enter 3 row and 5 columns the values should read
        //        12345
        //        246810
        //        3691215
        //        Display the contents of the array

        int rows, columns;
        int[][] userArray;

        System.out.printf("Row count: \n");
        rows = Integer.parseInt(stdin.nextLine());
        System.out.printf("Column count: \n");
        columns = Integer.parseInt(stdin.nextLine());

        userArray = new int[rows][columns];

        for(int i = 0; i < userArray.length; i++){
            for(int j = 0; j < userArray[i].length; j++){
                userArray[i][j] = (i + 1) * (j + 1);
            }
        }
        System.out.printf(Arrays.deepToString(userArray));
    }
}
