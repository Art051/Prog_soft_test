package exercises;

import java.util.Scanner;

public class Ex1_InterestCalculator
{

         /*
        equations:
            Total = P(1 + R)^T
            Interest = Total - P

            To calculate power:
            double a = Math.pow((1+R),T)
         */

    private static final Scanner stdin = new Scanner(System.in);


    public static void main(String[] args)
    {
        double principal, interestRate, timeYears, total, compoundInterest;

        System.out.print("Please enter the original principal sum: ");
        principal = Double.parseDouble(stdin.nextLine());

        System.out.print("Please enter the interest %%: ");
        interestRate = Double.parseDouble(stdin.nextLine()) / 100.00;

        System.out.print("Please enter the number of years over which interest will be paid: ");
        timeYears = Double.parseDouble(stdin.nextLine());

        total = principal * (Math.pow((1 + interestRate), timeYears));
        compoundInterest = (total - principal);
        System.out.printf("The total value is %.2f, the interest is %.2f.", total, compoundInterest);
    }
}
