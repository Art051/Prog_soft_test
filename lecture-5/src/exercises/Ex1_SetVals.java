package exercises;

import java.util.*;

public class Ex1_SetVals
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        //        setFirstLast();
//        telNums();
        prices();
        carNames();

    }


    public static void setFirstLast()
    {
        /*
        Set the first and last values
type[] numbers;
numbers = new type[6];
numbers[?] = 22; -- first
numbers[?] = 12; -- last
         */

        int[] numbers = new int[6];

        numbers[0] = 22;
        numbers[5] = 12;

        System.out.printf(Arrays.toString(numbers) + "\n");
    }

    public static void telNums()
    {
        /*
type[] telNumbers;
telNumbers = new type[33];
telNumbers[?] = “0737383”; -- first
telNumbers[?] = “0393939”; -- last
*/
        String[] telNumbers = new String[33];

        telNumbers[0] = "0737383";
        telNumbers[32] = "0393939";

        System.out.printf(Arrays.toString(telNumbers) + "\n");
    }

    public static void prices()
    {
                /*
type[] prices;
prices = new type[?];
prices[?] = 11.23;
prices[8] = 4.67;
*/
        double[] prices= new double[9];
        prices[0] = 11.23;
        prices[8] = 4.67;

        System.out.printf(Arrays.toString(prices) + "\n");
    }

    public static void carNames()
    {
/*
An array to contain 101 car names
Write to the first, second, third and last values in the array
*/
        String[] carNames = new String[101];

        carNames[0] = "Ford";
        carNames[1] = "Seat";
        carNames[2] = "Audi";
        carNames[100] = "Mazda";

        System.out.printf(Arrays.toString(carNames) + "\n");
    }


}
