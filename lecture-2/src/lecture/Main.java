package lecture;

import java.util.Scanner;

public class Main
{

    //Lecture = Input/output

    private static final Scanner stdin = new Scanner(System.in);
    
    public static void main(String[] args)
    {
        //printf = formatted string, see OneNote for further info
        String myName = "Arthur";
        int numCats = 2;
    
        System.out.printf("Hello my name is %s and I have %d cats", myName, numCats);
        
        
        //_______________________________________________________________________________________________________________
        String name;
        System.out.print("Please enter your name: ");
        name = stdin.nextLine();
        System.out.printf(name);
        
        
        //_______________________________________________________________________________________________________________
        //Parsing different data types from input (declaring the data type we anticipate
        int height;
        System.out.print("Please enter your height in cm: ");
        height = Integer.parseInt(stdin.nextLine());
    
        System.out.printf("You entered the height %dcm ", height);
        
        
        //_______________________________________________________________________________________________________________
        //Casting one data type to another
        double decimalNumber = 5.999999;
        int wholeNumber = (int)decimalNumber;
    
        System.out.printf("%d", wholeNumber);
        
        
       // _______________________________________________________________________________________________________________
        //In-line calculations
        int number = 3;
    
        System.out.printf("Number plus 4 = %d\n", number + 4);
        System.out.printf("Number plus 4 = %d\n", number);
    
        
        //_______________________________________________________________________________________________________________
        //'final word on conversion' slide example
        // by using int we lose the decimal places -> 2/4 would normally be 0.25, but due to being an int, we have 0 when using 2 first and 4 second.
    
        int firstNumber, secondNumber;
    
        System.out.print("Please enter first number: ");
        firstNumber = Integer.parseInt(stdin.nextLine());
    
        System.out.print("Please enter second number: ");
        secondNumber = Integer.parseInt(stdin.nextLine());
    
        double percentage = firstNumber / secondNumber * 100;   //this will result in a double being calculated first, therefore any result below 1 will be output as 0, need to explicitly cast
        double percentageCorrect = (double)firstNumber / (double)secondNumber * 100.00;   // both ints need to be cast individually - decimal for 100.00 isn't strictly needed, but just neater
    
        System.out.printf("First number is %f%% of the second number.\n", percentage);
        System.out.printf("First number is %f%% of the second number.\n", percentageCorrect);
    
       // ## int firstNumber, secondNumber;
    
        System.out.print("Please enter first number: ");
        firstNumber = Integer.parseInt(stdin.nextLine());
    
        System.out.print("Please enter second number: ");
        secondNumber = Integer.parseInt(stdin.nextLine());
    
        // ## double percentage = firstNumber / secondNumber * 100;   //this will result in a double being calculated first, therefore any result below 1 will be output as 0, need to explicitly cast
        // ## double percentageCorrect = (double)firstNumber / (double)secondNumber * 100.00;   // both ints need to be cast individually - decimal for 100.00 isn't strictly needed, but just neater
    
        System.out.printf("First number is %f%% of the second number.\n", percentage);
        System.out.printf("First number is %f%% of the second number.\n", percentageCorrect);
    }
}