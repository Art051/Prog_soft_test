package exercises;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

public class Ex1_Continued
{
    private static Scanner stdin = new Scanner(System.in);
    private static Random rng = new Random();


    public static void main(String[] args)
    {


        //    Display “Hello Tom the time is 02:30:33” followed by “You have a new message which reads: apples are good for you!”

        printGreeting("Tom");
        printMessage("apples are good for you");

    }


    public static void printGreeting(String name)
    {
        String time = LocalDateTime.now().format(DateTimeFormatter.ofPattern("HH:mm:ss"));

        System.out.printf("Hello %s ", name);
        System.out.printf("the time is ");
        System.out.printf(time);
        System.out.printf("\n");

    }

    public static void printMessage(String message)
    {
        System.out.printf("You have a new message which reads: %s !\n", message);
    }

}
