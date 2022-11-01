package exercises;

import java.util.Scanner;

public class Ex4_BikePrice {
    private static final Scanner stdin = new Scanner(System.in);


    public static void main(String[] args) {
        checkExpensiveBike();
    }

    public static void checkExpensiveBike() {

/*
The user enters the price of bike
When the price is more than £500 a message is displayed to let them know it is “Too expensive”

 */
        double bikePricePounds;
        double priceLimitPounds = 500.00;

        System.out.print("Please enter the price of the bike: \n");
        bikePricePounds = Double.parseDouble(stdin.nextLine());

        if (bikePricePounds > priceLimitPounds) {
            System.out.print("The bike is too expensive\n");
        }

    }
}
