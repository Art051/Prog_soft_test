package exercises;

public class Ex6_SumThreesFives
{
    /*
    If we list all the integer numbers below 16 that are multiples of 3 or 5, we get 3, 5, 6, 9, 10, 12, 15. The sum of these multiples is 60.
Find the sum of all the multiples of 3 or 5 below 1000.
     */


    public static void main(String[] args)
    {
        int sum = 0;
        for (int i = 0; i < 1000; i++)
        {
            if ((i % 3 == 0) || (i % 5 == 0))
            {
                sum += i;
            }
        }
        System.out.printf("%d", sum);
    }
}
