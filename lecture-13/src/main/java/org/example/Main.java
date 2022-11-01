package org.example;

public class Main
{
    public static void main(String[] args) throws SplitNumberException
    {

        // Exercise - Roman Numerals:
        /*
        Potential obstacles:
        1. Assign digit to letter
        2. Split number into digits OR calculate remainders
        3. Set/Apply the rules
        4 . Conversion of Arabic to Roman numerals (something to put everything together)
         */


    }

    //split input number into individual digits in an array
    public static int[] splitNumberIntoDigits(int number) throws SplitNumberException
    {

        if (number < 0 || number > 3999)
        {
            throw new SplitNumberException("Number entered cannot be negative.");
        }

        int[] splitDigits = {0, 0, 0, 0};

        splitDigits[0] = number / 1000;
        splitDigits[1] = (number / 100) % 10;
        splitDigits[2] = (number / 10) % 10;
        splitDigits[3] = number % 10;

        return splitDigits;
    }

    //convert individual digit fed in to method into roman numeral, using the three String parameters as assignments
    public static String convertDigToRoman(int digit, String smallestRom, String middleRom, String largestRom)
    {
        switch (digit)
        {
            case 1:
                return smallestRom;
            case 2:
                return smallestRom + smallestRom;
            case 3:
                return smallestRom + smallestRom + smallestRom;
            case 4:
                return smallestRom + middleRom;
            case 5:
                return middleRom;
            case 6:
                return middleRom + smallestRom;
            case 7:
                return middleRom + smallestRom + smallestRom;
            case 8:
                return middleRom + smallestRom + smallestRom + smallestRom;
            case 9:
                return smallestRom + largestRom;
            default:
                return "";
        }
    }

    //use splitNumberIntoDigits to split input into individual digits array -> loop through array to convert each unit in array into its corresponding roman numeral
    public static String convertArabicToRomanNumerals(int number) throws Exception
    {
        int[] digitArray = splitNumberIntoDigits(number);
        String result = "";
        for (int i = 0; i < digitArray.length; i++)
        {
            switch (i)
            {
                case 0:
                    result += convertDigToRoman(digitArray[i], "M", "", "");
                    continue;
                case 1:
                    result += convertDigToRoman(digitArray[i], "C", "D", "M");
                    continue;
                case 2:
                    result += convertDigToRoman(digitArray[i], "X", "L", "C");
                    continue;
                case 3:
                    result += convertDigToRoman(digitArray[i], "I", "V", "X");
            }
        }
        return result;
    }
}