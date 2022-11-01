package exercises;

import java.util.Scanner;

public class Ex4_Nuclear
{
    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        /*
        A nuclear reactor allows the operator to enter the initial temperature and pressure
When the temperature exceeds 1234oC the program prints out a final warning and ends
The user continually enterd new pressure values until the program ends
The temperature depends on the pressure and the change in temperature is calculated as follows:
Tchange = (newPressure – oldPressure) * 5


Enter initial temperature: 300
Enter initial pressure: 100

Enter new pressure: 80
Pressure change is -20
Temperature change is -100  <- Temperature is 200
Enter new pressure: 90
Pressure change is 10
Temperature change is 50 <- Temperature is 250

         */


        final double tempLimit = 1_234.00;
        double newTemp, tChange, newPressure, pressureChange;

        System.out.printf("Enter initial temperature: \n");
        newTemp = Double.parseDouble(stdin.nextLine());
        System.out.printf("Enter initial pressure: \n");
        newPressure = Double.parseDouble(stdin.nextLine());

        double currentPressure, currentTemp = newTemp;

        while (currentTemp <= tempLimit)
        {
            currentPressure = newPressure;

            System.out.printf("Enter new pressure: \n");
            newPressure = Double.parseDouble(stdin.nextLine());

            pressureChange = newPressure - currentPressure;
            System.out.printf("Pressure change is %.2f\n", pressureChange);

            tChange = (newPressure - currentPressure) * 5;
            System.out.printf("Temp change is %.2f\n", tChange);
            currentTemp += tChange;
        }
        System.out.printf("Temperature exceeded %.2f", tempLimit);
    }
}
