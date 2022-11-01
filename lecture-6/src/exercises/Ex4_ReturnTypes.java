package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex4_ReturnTypes
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {
        // Write code calling the following functions, display the return values.
        System.out.printf("%d\n", addNumbers(3, 22));
        System.out.printf("%s\n", convertToNumber("3"));
        System.out.printf("%f\n", areaOfParallelogram(3.5, 2));
    }


    //    Add two numbers
    public static int addNumbers(int num1, int num2)
    {
        return num1 + num2;
    }


    //Convert string to a number
    public static int convertToNumber(String numberText)
    {
        return Integer.parseInt(numberText);
    }

    //    Calculate area of parallelogram
    public static double areaOfParallelogram(
            double base,
            double height)
    {
        double area;
        area = base * height;
        return area;
    }
}
