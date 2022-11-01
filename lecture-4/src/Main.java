import java.util.Scanner;

public class Main
{

    private static final Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        nestedForLoops();
    }

    public static void basicLoop()
    {
        int count;
        int maxCount = 20;

        for (count = 0; count < maxCount; count++) // incr by 2 -> count = count + 2  OR count += 2

        {
            System.out.printf("Hello, count is %d\n", count);
        }

        System.out.printf("Count after loop is %d\n", count);

        System.out.printf("Finished loop \n");
    }


    public static void loopingUserInput()
    {
        System.out.printf("Please enter a number to count up to: ");
        int maxCount = Integer.parseInt(stdin.nextLine());

        for (int i = 0; i <= maxCount; i++)
        {
            System.out.printf("Hello, count is %d\n", i);
        }
        System.out.printf("Finished loop\n");
    }


    public static void whileLoop()
    {
        //pre-condition loop
        int number, sum;

        System.out.printf("Enter value:\n");
        sum = Integer.parseInt(stdin.nextLine());

        while (sum < 100)
        {
            System.out.printf("Sum is %d:\n", sum);

            System.out.printf("Enter value:\n");
            number = Integer.parseInt(stdin.nextLine());
            sum = sum + number;
        }

    }

    public static void doWhileLoop()
    {
        //post-condition loop

        int number, sum;

        System.out.printf("Enter value:\n");
        sum = Integer.parseInt(stdin.nextLine());

        do
        {
            System.out.printf("Sum is %d:\n", sum);

            System.out.printf("Enter value:\n");
            number = Integer.parseInt(stdin.nextLine());
            sum = sum + number;
        }
        while (sum < 100);

    }

    public static void breakStatement()
    {
        for (int i = 0; i < 100; i++)
        {
            System.out.printf("%d\n", i);

            if (i == 70)
            {
                System.out.printf("i has become 70!\n");
                break; // if we used 'continue' here instead, we would skip this and go to the next loop, therefore skipping 70 and continuing to 100 -> break/continue not commonly used
            }
            System.out.printf("%d\n", i);
        }
        System.out.printf("Loop has finished.\n");
    }

    public static void nestedForLoops()
    {
        for (int i = 0; i < 10; i++)
        {
            for (int j = i; j < 10; j++)
            {
                // System.out.printf("i =  %d, j = %d\n", i, j);
                System.out.printf("o");
            }
            System.out.printf("\n");
        }
        System.out.printf("Loop finished.\n");
    }
}