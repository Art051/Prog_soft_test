package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Ex6_SmallestLargest {

    private static final Scanner stdin = new Scanner(System.in);

    /*
The user enters 4 whole numbers and once all the values are entered the program displays the smallest and largest values
Example:

Enter number: 1
Enter number: 6
Enter number: 2
Enter number: 4
Smallest = 1
Largest = 6

Hint 1: Think of this as two separate problems
Hint 2: Create variables to hold the current smallest and largest values
     */


    public static void main(String[] args) {

//        findSmallestLargestLongWinded();
//        findSmallestLargestShort();
//        arrayStreamSmallestLargest();

    }


    public static void arrayStreamSmallestLargest() {

        int[] userInputArr = new int[4]; // Store user input as an array

        // loop through the array to store user input
        for (int i = 0; i < userInputArr.length; i++) {
            System.out.printf("Please enter number %d in the series: \n", i + 1); // the 'i + 1' is due t indexes starting at '0' - we wouldn't ask the user to input option '0'
            userInputArr[i] = Integer.parseInt(stdin.nextLine()); //assigns the user input to the index of the current loop - indexes start  at '0'
        }

        // use the stream() method to enable easier interrogation of array  contents using built-in methods
        System.out.printf("The smallest value input is %d\nThe largest value input is %d\n",
                Arrays.stream(userInputArr).min().getAsInt(),
                Arrays.stream(userInputArr).max().getAsInt());
    }


    public static void findSmallestLargestShort() {
        int smallestInput = Integer.MAX_VALUE; // this sets the smallest input at the largest possible integer value allowed, used to initialise the variable as otherwise the first iteration of the loop belw will not work
        int largestInput = Integer.MIN_VALUE; // same as above comment but in reverse
        int currentInput;


        // for-each loop to repeat the request for user input until 4 inputs are obtained
        //compares input each time against existing stored minimum and maximum and re-assigns as appropriate
        for (int i = 0; i < 4; i++) {
            System.out.printf("Please enter number %d in the series: \n", i + 1);
            currentInput = Integer.parseInt(stdin.nextLine());

            if (currentInput < smallestInput) {
                smallestInput = currentInput;
            }
            else if (currentInput > largestInput) {
                largestInput = currentInput;
            }
        }

        System.out.printf("The smallest value input is %d, the largest value input is %d\n", smallestInput, largestInput);
    }


    public static void findSmallestLargestLongWinded() {
        //this is a very long-winded method repeating a lot of code
        int smallestInput, largestInput, currentInput;

        System.out.print("Please enter the first number: \n");
        currentInput = Integer.parseInt(stdin.nextLine());
        smallestInput = currentInput;
        largestInput = currentInput;


        System.out.print("Please enter the second number: \n");
        currentInput = Integer.parseInt(stdin.nextLine());

        if (currentInput < smallestInput) {
            smallestInput = currentInput;
        }
        else if (currentInput > largestInput) {
            largestInput = currentInput;
        }

        System.out.print("Please enter the second number: \n");
        currentInput = Integer.parseInt(stdin.nextLine());

        if (currentInput < smallestInput) {
            smallestInput = currentInput;
        }
        else if (currentInput > largestInput) {
            largestInput = currentInput;
        }

        System.out.print("Please enter the second number: \n");
        currentInput = Integer.parseInt(stdin.nextLine());

        if (currentInput < smallestInput) {
            smallestInput = currentInput;
        }
        else if (currentInput > largestInput) {
            largestInput = currentInput;
        }

        System.out.printf("The smallest value input is %d, the largest value input is %d\n", smallestInput, largestInput);
    }
}
