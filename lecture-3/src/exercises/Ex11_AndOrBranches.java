package exercises;

import java.util.Scanner;

public class Ex11_AndOrBranches
{

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        checkTemp();
        countDogs();
        speedThirtyOrSixty();
        aCoinsBCoins();

    }


    public static void checkTemp()
    {
        /*
        Enter the temperature
        Display “the temperature is within the range 20.4 to 30.9”
         */

        System.out.print("Enter a temperature: \n");
        double tempC = Double.parseDouble(stdin.nextLine());
        if ((tempC >= 20.4) && (tempC <= 30.9))
        {
            System.out.print("the temperature is within the range 20.4 to 30.9\n");
        }
    }


    public static void countDogs()
    {
        /*
        Enter the count of the number of dogs
        Display “the number of dogs has reached at least 67 and has not exceeded 83”
         */

        System.out.print("Enter the number of dogs: \n");
        int dogCount = Integer.parseInt((stdin.nextLine()));
        if ((dogCount >= 67) && (dogCount <= 83))
        {
            System.out.print("the number of dogs has reached at least 67 and has not exceeded 83\n");
        }
    }

    public static void speedThirtyOrSixty()
    {
        /*
        Enter the speed
        Display “the speed is 30 or the speed is 60”
         */

        System.out.print("Enter the speed: \n");
        int speed = Integer.parseInt((stdin.nextLine()));
        if ((speed == 30) || (speed == 60))
        {
            System.out.print("The speed is 30 or the speed is 60\n");
        }
    }

    public static void aCoinsBCoins()
    {
        /*
Enter the coins A and the number of coins B
Only one message should be displayed and they should appear in the following order.
Display “the value of the coins A is 73 and the difference in values has exceed 20”
Display “the value of the coins A is lower than value of coins B and the total is 189”
Display “the value of coins A exceed 100, alternatively the value of coins B exceeds 200”
         */

        System.out.print("Enter the number of 'A' coins\n");
        int aCount = Integer.parseInt(stdin.nextLine());
        System.out.print("Enter the number of 'B' coins\n");
        int bCount = Integer.parseInt(stdin.nextLine());

        int difference = Math.abs(aCount - bCount);
        int total = aCount + bCount;

        if ((aCount == 73) && (difference > 20))
        {
            System.out.print("the value of the coins A is 73 and the difference in values has exceed 20\n");
        }
        else if ((aCount < bCount) && (total == 189))
        {
            System.out.print("the value of the coins A is lower than value of coins B and the total is 189\n");
        }
        else if ((aCount > 100) || (bCount > 200))
        {
            System.out.print("the value of coins A exceed 100, alternatively the value of coins B exceeds 200\n");
        }
    }

}
