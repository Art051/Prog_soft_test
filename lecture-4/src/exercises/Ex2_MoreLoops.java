package exercises;

import java.util.Scanner;

public class Ex2_MoreLoops
{
    public static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

//        reverseBottles();
//        displayIncrFour();
//        displayTwoNums();
//        displaySavings();
    }


    public static void reverseBottles()
    {

        // "10 green bottles" until hitting 0
        for (int i = 10; i >= 0; i--)
        {
            System.out.printf("%d green bottles\n", i);
        }
    }

    public static void displayIncrFour()
    {
        // Display: Number 101Number 105Number 109
        for (int i = 101; i < 110; i += 4)
        {
            System.out.printf("Number %d\n", i);
        }
    }

    public static void displayTwoNums()
    {
        //Display:Numbers are 34  22Numbers are 24  32Numbers are 14  42

        int numOne = 34, numTwo = 22;

        for (int i = 0; i < 3; i++)
        {
            System.out.printf("Numbers are %d %d\n", numOne, numTwo);
            numOne -= 10;
            numTwo += 10;
        }
    }

    public static void displaySavings(){
        /*
        Calculate and display the saving on £28 given the following percentage discounts:5%, 6%, 7%, 8%, 9%, 10%, 11%
        Answers:1.4, 1.68, 1.96, 2.24, 2.52, 2.8, 3.08

         */
        double principal = 28;

        for(int i = 5; i < 12; i++){
            System.out.printf("%.2f\n", (((double)i / 100) * principal));
        }
    }

}
