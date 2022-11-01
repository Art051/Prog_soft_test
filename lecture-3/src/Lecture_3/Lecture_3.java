package Lecture_3;

import java.util.Scanner;

public class Lecture_3
{
    //Lecture = Basic, nested and multiple conditional statements
    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.print("Please enter a number: ");
        int number = Integer.parseInt(stdin.nextLine());
        String a = "abc";
        if (number > 10)
        {
            System.out.print("Is larger.\n");
        }

        System.out.print("Program finished.\n");


    }

}
