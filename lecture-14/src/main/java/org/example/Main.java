package org.example;

import java.util.Arrays;
import java.util.Scanner;

public class Main
{
    // Debugging:
    /*
    Step over - steps past the current line, continues to next line
    Step into - goes into the current line (if there's a method as we are using below, it will go into the method being called and enables viewing variables and method outputs step by step)
     */

    private static Scanner stdin = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.printf("%d\n", addNumbers(1));
        System.out.printf("%d\n", addNumbers(1, 2));
        System.out.printf("%d\n", addNumbers(1, 2, 3));
        System.out.printf("%d\n", addNumbers(1, 2, 3, 4));
        System.out.printf("%d\n", addNumbers(1, 2, 3, 4, 5, 7, 8, 9, 10));

    }

    public static int addNumbers(int num, int... nums)
    {
        if (nums.length == 0)
        {
            return num;
        }

        return num + addNumbers(nums[0], Arrays.copyOfRange(nums, 1, nums.length));
    }
}