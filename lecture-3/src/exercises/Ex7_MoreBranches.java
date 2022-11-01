package exercises;

import java.util.Scanner;

public class Ex7_MoreBranches {
    private static final Scanner stdin = new Scanner(System.in);


    public static void main(String[] args) {

        bulkDiscountCheck();

        boilerTempPressure();

        bookPublisher();

    }


    public static void bulkDiscountCheck() {
        /*
            Enter price and quantity
            If the price exceeds 200 and the quantity is 10 or more then give a discount of 10% on the total price
         */
        double price, quantity, totalPricePounds;

        System.out.print("Please enter the unit price: \n\n");
        price = Double.parseDouble(stdin.nextLine());
        System.out.print("Please enter the quantity: \n\n");
        quantity = Double.parseDouble(stdin.nextLine());

        if (price > 200 && quantity >= 10) {
            totalPricePounds = (price * quantity) * 0.9;
        }
        else {
            totalPricePounds = (price * quantity);
        }

        System.out.printf("The price is %.2f\n", totalPricePounds);

    }


    public static void boilerTempPressure() {

    /*
    Enter the temperature and pressure of a boiler
    When the temperature is over 728o C display “Temperature is over 728 degrees” and
     when the pressure also reaches 182 then display a message “Pressure too high for current temperature”.
     Otherwise, display “All OK”
     */

        double tempCelsius, pressure;

        System.out.print("Please enter the temperature of the boiler: \n\n");
        tempCelsius = Double.parseDouble(stdin.nextLine());

        System.out.print("Please enter the pressure of the boiler: \n\n");
        pressure = Double.parseDouble(stdin.nextLine());

        if (tempCelsius > 728) {
            if (pressure >= 182) {
                System.out.print("Pressure too high for current temperature\n\n");
            }
            System.out.print("Temperature is over 728 degrees\n\n");
        }
        else {
            System.out.print("All OK\n");
        }
    }


    public static void bookPublisher() {
        /*
        Enter the title, category and publisher of a book
        All books by O’Reilly or Quercus should result in a message saying “We don’t sell books by these publishers”
        All books in the category Fiction should result in a message “We don’t sell this type of book”
        Constraint: Only one message should be displayed
        Write the code
         */

        String title, category, publisher;

        System.out.print("Please enter the title of the book\n");
        title = stdin.nextLine();

        System.out.print("Please enter the publisher of the book\n");
        publisher = stdin.nextLine();
        if ((publisher.equalsIgnoreCase("O'Reilly")) || (publisher.equalsIgnoreCase("Quercus"))) {
            System.out.print("We don’t sell books by these publishers\n");
        }
        else {
            System.out.print("Please enter the category of the book\n");
            category = stdin.nextLine();
            if (category.equalsIgnoreCase("Fiction")) {
                System.out.print("We don't sell this type of book\n");
            }
        }
    }

}
