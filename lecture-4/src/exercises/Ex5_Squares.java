package exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex5_Squares
{

    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();

    public static void main(String[] args)
    {

        findNineSixty();
//        simpleMathsQuiz();
    }

    public static void findNineSixty()
    {
                /*
        Display the widths and lengths of a square that will result in an area of 960 (whole number values only) e.g.
        1 x 960 = 96
        2 x 480 = 960

        HINT:
        Whole numbers have no remainder.
        result = X / Y;
        remainder = (X % Y)
        Say X = 2 and Y = 2result is 1.0 and remainder = 0.0
        Say X = 3 and Y = 2result is 1.5 and remainder = 0.5
         */
        int findDivsOf = 960;
        for (int i = 1; i < findDivsOf; i++)
        {
            if (findDivsOf % i == 0)
            {
                System.out.printf("%d x %d = %d\n", i, findDivsOf / i, findDivsOf);
            }
        }
    }

    /*
            Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a number: ");
        int userInput = scanner.nextInt();

        if(((userInput % 5) == 0) && ((userInput % 3) == 0))
            System.out.println("FizzBuzz");
        else if(userInput % 3 == 0)
            System.out.println("Buzz");
        else if(userInput % 5 == 0)
            System.out.println("Fizz");
        else System.out.println(userInput);
    }
}
     */

    public static void simpleMathsQuiz()
    {
        /*
        Build a simple math quiz game
The player is presented with a random math question e.g.4 + 5 = ?
They one point per a correct answer
They have three lives
Display the score when they lose all their lives

static Random rnd = new Random();
int  randomNumber = rnd.nextInt(5);   // 0 to 4
         */

        int firstDigit, maxFirstDigit = 10, secondDigit, maxSecondigit = 10, lives = 3, currentScore = 0;


        while (lives > 0)
        {
            double equationAns = 0, playerAns;
            firstDigit = rng.nextInt(maxFirstDigit);
            secondDigit = rng.nextInt(maxSecondigit);

            int operatorChoice = rng.nextInt(1, 5);
            switch (operatorChoice)
            {
                case (1):
                {
                    equationAns = firstDigit + secondDigit;
                    System.out.printf("Equation: %d + %d", firstDigit, secondDigit);
                    break;
                }
                case (2):
                {
                    equationAns = firstDigit - secondDigit;
                    System.out.printf("Equation: %d - %d", firstDigit, secondDigit);
                    break;
                }
                case (3):
                {
                    equationAns = firstDigit / secondDigit;
                    System.out.printf("Equation: %d / %d", firstDigit, secondDigit);
                    break;
                }
                case (4):
                    equationAns = firstDigit * secondDigit;
                    System.out.printf("Equation: %d X %d", firstDigit, secondDigit);
                    break;

            }

            System.out.printf("Your answer: \n");
            playerAns = Double.parseDouble(stdin.nextLine());

            if (playerAns == equationAns)
            {
                currentScore++;
            }
            else
            {
                lives--;
            }
        }
        System.out.printf("You're out of lives, your final score was %d", currentScore);
    }
}
