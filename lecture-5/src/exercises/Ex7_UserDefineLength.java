package exercises;

import java.util.Scanner;

public class Ex7_UserDefineLength
{

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {

//        mainExercise();
        additionalExercise();
    }

    public static void mainExercise()
    {
        /*
                You can create an array using a variable to specify the array length
Ask the user how many words they wish to enter
Read the words entered by the user
After they have all been entered print all the words they entered
         */

        String[] usersWords;
        int arrayLength;

        System.out.printf("How many words would you like to enter?\n");
        arrayLength = Integer.parseInt(stdin.nextLine());
        usersWords = new String[arrayLength];

        for(int i = 0; i < usersWords.length; i++){
            System.out.printf("Please enter a word: \n");
            usersWords[i] = stdin.nextLine();
        }

        for(String word : usersWords){
            System.out.printf("%s\n", word);
        }
    }

    public static void additionalExercise()
    {
        /*
        Additional Exercise:
Display all the words entered but in reverse order.
         */

        String[] usersWords;
        int arrayLength;

        System.out.printf("How many words would you like to enter?\n");
        arrayLength = Integer.parseInt(stdin.nextLine());
        usersWords = new String[arrayLength];

        for(int i = 0; i < usersWords.length; i++){
            System.out.printf("Please enter a word: \n");
            usersWords[i] = stdin.nextLine();
        }

        for(int i = usersWords.length - 1; i >= 0; i--){
            System.out.printf("%s\n", usersWords[i]);
        }
    }
}
