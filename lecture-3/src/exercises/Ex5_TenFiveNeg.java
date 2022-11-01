package exercises;

import java.util.Scanner;

public class Ex5_TenFiveNeg {

    private static final Scanner stdin = new Scanner(System.in);


    public static void main(String[] args) {
        tenFiveNegBranch();
    }

    public static void tenFiveNegBranch()
    /*
The user enters a number (e.g. 3, 4, 5, etc)
Display either
“The number entered exceeds 10
“The number entered matches 5
“The number entered is negative”
     */ {

        double userNumInput;

        System.out.print("Please enter a number\n");
        userNumInput = Double.parseDouble(stdin.nextLine());

        if (userNumInput < 0) {
            System.out.print("The number entered is negative\n");
        }
        else if (userNumInput == 5) {
            System.out.print("The number entered matches 5\n");

        }
        else if (userNumInput > 10) {
            System.out.print("The number entered exceeds 10\n");
        }

    }
}
