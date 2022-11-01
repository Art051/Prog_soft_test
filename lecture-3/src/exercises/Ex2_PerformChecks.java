package exercises;

import java.util.Scanner;

public class Ex2_PerformChecks {
    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {

    }

    public static void motorSpeed() {
        /*
Enter speed of the motor
Display these messages when relevant
“The motor speed is less than 112”
“The motor speed is more than or equal to 112”
*/
        int speed;

        System.out.printf("Enter the speed of the motor: \n");
        speed = Integer.parseInt(stdin.nextLine());

        if (speed < 112) {
            System.out.printf("The motor speed is less than 112\n");
        }
        else {
            System.out.printf("The motor speed is more than or equal to 112");
        }
    }


    public static void twentyConditional() {

        /*
Enter number of products purchased
Display these messages when relevant:
“The number of products is greater than 20”
“The number of products is less than or equal to 20”
         */

        int productsPurchasesCount;
        int twentyLimit = 20;

        System.out.print("Please enter tthe number of products purchased: \n");
        productsPurchasesCount = Integer.parseInt(stdin.nextLine());

        if (productsPurchasesCount > twentyLimit) {
            System.out.print("The number of products is greater than 20\n");
        }
        else {
            System.out.print("The number of products is less than or equal to 20\n");
        }

    }
}
