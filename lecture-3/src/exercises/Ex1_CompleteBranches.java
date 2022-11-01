package exercises;

import java.util.Scanner;

public class Ex1_CompleteBranches {

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args) {


    }


    public static void inputGreaterThanLimit() {
//        Enter price
//        Display “Price is greater than £302.20p” when appropriate.
        double inputPricePence;
        double priceBoundaryPounds = 302.20;

        System.out.print("Please enter the price of the item in pounds and pence: \n");
        inputPricePence = Double.parseDouble(stdin.nextLine());

        if (inputPricePence > priceBoundaryPounds) {
            System.out.printf("£%.2fp is greater than £302.20p\n", inputPricePence);
        }
    }


    public static void weCountPens() {
        // Enter number of pens
        // Display “Number of pens is less than 20” when appropriate.

        int inputPenCount;
        int penCountBoundary = 20;

        System.out.print("Please enter the number of pens: \n");
        inputPenCount = Integer.parseInt(stdin.nextLine());

        if (inputPenCount < penCountBoundary) {
            System.out.printf("%d is less than 20\n", inputPenCount);
        }
    }


    public static void measureFence() {
        // Enter length of fence
        // Display “Length is less than or equal to 12.9m” when appropriate.

        double fenceLengthMetres;
        double fenceLengthBoundaryMetres = 12.9;

        System.out.print("Please enter the length of the fence: \n");
        fenceLengthMetres = Double.parseDouble(stdin.nextLine());

        if (fenceLengthMetres <= fenceLengthBoundaryMetres) {
            System.out.printf("%.1fm is less than or equal to 12.9m\n", fenceLengthMetres);
        }
    }

    public static void countBooksRead() {
//        Enter two values
//        type bookCount = ???;
//        type maxBooks = ???;
//        Display “You have read greater than or equal to max books” when appropriate.

        int bookReadCount;
        int maxBooksCount;

        System.out.print("Please enter the number of books you have read: \n");
        bookReadCount = Integer.parseInt(stdin.nextLine());
        System.out.print("Please enter the maximum number of books available: \n");
        maxBooksCount = Integer.parseInt(stdin.nextLine());

        if (bookReadCount >= maxBooksCount) {
            System.out.printf("You have read greater than or equal to %d books\n", maxBooksCount);
        }
    }


    public static void areaOfSquare() {
//        Enter the length of side of a square e.g. 3.2cm
//        Enter the minimum allowed area
//        Display “The area of the square is less than the minimum allowed area” when appropriate.

        double squareSideMetres;
        double minAllowedArea;
        double squareArea;

        System.out.print("Please enter the length of side of a square: \n");
        squareSideMetres = Double.parseDouble(stdin.nextLine());
        squareArea = Math.pow(squareSideMetres, 2);

        System.out.print("Please enter the minimum square metres of the square: \n");
        minAllowedArea = Double.parseDouble(stdin.nextLine());

        if (squareArea < minAllowedArea) {
            System.out.printf("The area of the square (%.2f) is less than the minimum allowed area (%.2f)\n", squareArea, minAllowedArea);
        }
    }
}