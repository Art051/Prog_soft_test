package exercises;

import java.util.ArrayList;

public class Ex3_CashDenomCalculator
{

    /*
    Create a cash denomination calculator. This should take in a value in GBP and return the way to represent it with the smallest quantity of standard notes and coins.
Standard notes are £50, £20, £10, £5.
Standard coins are £2, £1, 50p, 20p, 10p, 5p, 2p, 1p.
E.G. if given the value £5.55, you should output:
£5: 1
50p: 1
5p: 1
You should not output the value of coins or notes you are not using.
You should always find the most efficient way. E.G. for £0.04, 2 x 2p is correct, 4 x 1p is incorrect.     */


    public static void main(String[] args)
    {
        printDenominationsUsed(countDenominations(5.55));
    }

    /**
     * <P>
     *     Takes inputGBP as a decimal value.
     *     Iterates through an array of stored values representing penny values of denominations.
     *     Iterates through the pence array comparing the remaining balance to the current pence value.
     *     If remaining balance is greater than pence value, divides by the pence value and reduces balance by
     *     pence value * number of times the pence value fits into the remaining balance.
     *     Exits loop upon reaching remaining balance == 0, avoids adding zero count values to unused pence values.
     * @param inputGBP decimal representation of input in GBP.
     * @return ArrayList<int [ ]> where int[0] = pence value of denomination, int[1] = count of denomination.
     */
    static ArrayList<int[]> countDenominations(double inputGBP)
    {
        int[] denomCountsInPence = {5000, 2000, 1000, 500, 200, 100, 50, 20, 10, 5, 2, 1};
        ArrayList<int[]> denominationsUsed = new ArrayList<>();

        int inputGBPToPence = (int) (inputGBP * 100);
        int denomPos = 0;
        while (inputGBPToPence > 0)
        {
            int[] denomAndCount = {denomCountsInPence[denomPos], inputGBPToPence / denomCountsInPence[denomPos]};
            if (denomAndCount[1] != 0)
            {
                denominationsUsed.add(new int[]{denomCountsInPence[denomPos], inputGBPToPence / denomCountsInPence[denomPos]});
            }
            inputGBPToPence -= (denomCountsInPence[denomPos] * (inputGBPToPence / denomCountsInPence[denomPos]));
            denomPos++;
        }
        return denominationsUsed;
    }

    /**
     * <P>
     *     Iterates through denomsUsed parameter.
     *     If index 0 of each array in the list is >= 100 (£1 in pence value), prints value with printf() format to represent the value in '£00.00' format.
     *     else - If index 0 of each array in the list is  < 100 (£1 in pence value), prints value with printf() format to represent the value in '0p' format.
     * @param denomsUsed ArrayList<int[]> - each int[] in list represents a denomination in index '0' and count of respective denomination in index '1'.
     */
    public static void printDenominationsUsed(ArrayList<int[]> denomsUsed)
    {
        {
            for (int[] denomAndCount : denomsUsed)
            {
                if (denomAndCount[0] >= 100)
                {
                    System.out.printf("£%d: %d\n", denomAndCount[0] / 100, denomAndCount[1]);
                }
                else
                {
                    System.out.printf("%dp: %d\n", denomAndCount[0], denomAndCount[1]);
                }
            }
        }
    }
}
