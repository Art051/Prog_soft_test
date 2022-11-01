package exercises;

import java.util.Scanner;

public class Ex10_NumberMenu
{
    /*
    Create an application that asks the user to add, subtract, multiply or divide two numbers using a menu to select the required operation
    void performOperation(int option)
     int ReadNumber(string prompt)
     Switch Pattern

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Select: 1
Enter first number: 4
Enter second number: 5
Sum is 9

1. Add
2. Subtract
3. Multiply
4. Divide
5. Exit
Select:    --  Repeat until 5 is selected to exit the application (loop back to the top)
     */


    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

        performOperation();

    }


    public static void performOperation()
    {

        int functionChoice = 0, firstChoice, secondChoice;
        double outputNum = 0;

        while (functionChoice != 5)
        {
            System.out.printf(
                            "1. Add\n" +
                            "2. Subtract\n" +
                            "3. Multiply\n" +
                            "4. Divide\n" +
                            "5. Exit\n");


            functionChoice = readInteger("Select: \n");
            if (functionChoice == 5)
            {
                break;
            }
            else
            {
                firstChoice = readInteger("Enter first number: \n");
                secondChoice = readInteger("Enter second number: \n");
                switch (functionChoice)
                {
                    case (1):
                        outputNum = firstChoice + secondChoice;
                        break;
                    case (2):
                        outputNum = firstChoice - secondChoice;
                        break;
                    case (3):
                        outputNum = firstChoice * secondChoice;
                        break;
                    case (4):
                        outputNum = (double) firstChoice / (double) secondChoice;
                        break;
                }
                System.out.printf("Sum is %.2f\n", outputNum);
            }
        }
    }

    public static int readInteger(String prompt)
    {
        boolean read = true;
        int enteredNumber = 0;

        System.out.printf(prompt);
        while (read)
        {
            try
            {
                enteredNumber = Integer.parseInt(stdin.nextLine());
                read = false;
            }
            catch (NumberFormatException e)
            {
                System.out.printf("Try again, that wasn't a valid entry: \n");
            }
        }
        return enteredNumber;
    }

}
