import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main
{
    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();

    public static void main(String[] args)
    {
        //        Topic: Arrays

    }

    public static void traverseArray()
    {

        int[] numbers = new int[4];

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("Please enter number: ");
            numbers[i] = Integer.parseInt(stdin.nextLine());
        }

        for (int i = 0; i < numbers.length; i++)
        {
            System.out.printf("Number %d: %d\n", (i + 1), numbers[i]);
        }
    }

    public static void generateThenIterate()
    {

        final int numElements = 10;
        int[] numbers = new int[numElements];

        for (int i = 0; i < numElements; i++)
        {
            numbers[i] = rng.nextInt(10);
        }

        for (int i = 0; i < numElements; i++)
        {
            System.out.printf("%d\n", numbers[i]);
        }

        for (int i = 0; i < numElements; i++)
        {
            if (numbers[i] == 7)
            {
                System.out.printf("Number 7 found!\n");
                break;
            }
        }
    }

    public static void twoDimenArrays()
    {
        final int outerSize = 2;
        final int innerSize = 4;
        int[][] numbers = new int[outerSize][innerSize];

        for (int i = 0; i < outerSize; i++)
        {
            for (int j = 0; j < innerSize; j++)
            {
                numbers[i][j] = Integer.parseInt(stdin.nextLine());
            }
        }

        for (int i = 0; i < outerSize; i++)
        {
            for (int j = 0; j < innerSize; j++)
            {
                System.out.printf("%d ", numbers[i][j]);
            }
            System.out.printf("\n");
        }

    }

    public static void arrLists()
    {


        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(5);
        numbers.add(12);
        numbers.add(-3);
        numbers.add(0);
        numbers.add(7);


        for (int i = 0; i < numbers.size(); i++)
        {
            System.out.printf("%d\n", numbers.get(i));
        }

        // for each
        for (int num : numbers){
            System.out.printf("%d\n", num);
        }
    }
}