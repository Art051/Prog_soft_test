package exercises;

import java.util.Scanner;

public class Ex10_TemperatureBranches
{
    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        firstQuestion();
        secondQuestion();

    }

    public static void firstQuestion()
    {
        //        Given a temperature under 100 check
        //        pressure is below 56 and display “pressure too low”
        //        pressure is 23 or under and display “warning pressure is falling too low”
        //        Given a temperate at 300 or more check
        //        Pressure is above 182 and display “warning pressure is rising to high”
        //        Pressure is above 239 and display “pressure too high”

        System.out.print("Please enter the temperature: \n");
        double inputTemp = Double.parseDouble(stdin.nextLine());
        System.out.print("Please enter the pressure: \n");
        double inputPressure = Double.parseDouble(stdin.nextLine());

        if (inputTemp < 100)
        {
            if (inputPressure <= 23)
            {
                System.out.print("warning pressure is falling too low");
            }
            else if (inputPressure < 56)
            {
                System.out.print("pressure too low");
            }
        }
        else if (inputTemp >= 300)
        {
            if (inputPressure > 239)
            {
                System.out.print("pressure too high");
            }
            else if (inputPressure > 182)
            {
                System.out.print("warning pressure is rising too high");
            }

        }
    }

    public static void secondQuestion()
    {
        //        Given a temperature exceeding 983 check
        //        pressure is 172 or higher and display “warning pressure is too high”
        //        pressure is 129 or above and display “alert pressure is very high”
        //        Given a temperature below 87 check
        //        pressure is below 43 and display “pressure too low”
        //        Pressure is below 85 and display “pressure unsafe”


        System.out.print("Please enter the temperature: \n");
        double inputTemp = Double.parseDouble(stdin.nextLine());
        System.out.print("Please enter the pressure: \n");
        double inputPressure = Double.parseDouble(stdin.nextLine());

        if (inputTemp > 983)
        {
            if (inputPressure >= 172)
            {
                System.out.print("warning pressure is too high");
            }
            else if (inputPressure >= 129)
            {
                System.out.print("alert pressure is very high");
            }
        }
        else if (inputTemp < 87)
        {
            if (inputPressure < 43)
            {
                System.out.print("pressure too low");
            }
            else if (inputPressure < 85)
            {
                System.out.print("pressure unsafe");
            }

        }
    }

}
