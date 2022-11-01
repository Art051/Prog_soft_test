package exercises;

import java.util.Scanner;

public class Ex12_MonthlyTemps
{

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        checkForOverlap();

    }


    public static void checkForOverlap()
    {
        /*
In an experiment the temperature was measured across two different months, and the maximum and minimum values for both months was recorded
The program should allow the user to enter the minimum and maximum value for both months
A program is required to determine if the temperature ranges overlapped or whether the range of temperatures during one month was always higher than the other

Examples:
Range1 is 30oC to 50oC
Range2 is 42oC to 86oC
Ranges overlap

Range1 is 30oC to 50oC
Range2 is 60oC to 70oC
Ranges don’t overlap
     */

        int monthOneMin, monthOneMax, monthTwoMin, monthTwoMax;

        System.out.print("Please enter the min temp for the first month: \n");
        monthOneMin = Integer.parseInt(stdin.nextLine());
        System.out.print("Please enter the max temp for the first month: \n");
        monthOneMax = Integer.parseInt(stdin.nextLine());
        System.out.print("Please enter the min temp for the second month: \n");
        monthTwoMin = Integer.parseInt(stdin.nextLine());
        System.out.print("Please enter the max temp for the second month: \n");
        monthTwoMax = Integer.parseInt(stdin.nextLine());

        if ((monthOneMax > monthTwoMin) || (monthOneMin > monthTwoMax))
        {
            System.out.print("Ranges overlap\n");
        }
        else
        {
            System.out.print("Ranges don’t overlap\n");
        }
    }

}
