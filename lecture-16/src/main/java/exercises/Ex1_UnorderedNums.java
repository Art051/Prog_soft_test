package exercises;

import java.util.Arrays;

public class Ex1_UnorderedNums
{
        /*
        Take an unordered group of whole numbers (you may decide the data structure).
        Find the largest gap between numerically ordered numbers.
        E.G. if provided with:
        11, 14, 10, 5, 1, 5, 12, 16, 6, 12, 10, 10, 12, 14, 4, 11
     Your function should return 4. Because when ordered numerically, the largest    	gap is between 6 and 10.

         */

    public static void main(String[] args)
    {
        int result = findMaxGap(new int[]{11, 14, 10, 5, 1, 5, 12, 16, 6, 12, 10, 10, 12, 14, 4, 11});
        System.out.printf("%d", result);
    }

    /**
     * <P>
     *      This method utilises the Arrays class' sort() method, which will sort the input array's elements in ascending order.
     *      A maxGap value is assigned '0' initially, as if there is only one element, there will be no gap
     *      and if all elements are the same, there will be no gap.
     *      A for loop is then used, starting at index 1 - the loop compares each index's value against the previous index's value,
     *      if the gap between the current two index values exceeds maxGap the maxGap is re-assigned to the current gap value.
     * @param unorderedNums An integer array which is in no specific order
     * @return an integer representing the largest gap between two elements in the input array, having sorted them in ascending order.
     */
    public static int findMaxGap(int[] unorderedNums)
    {
        Arrays.sort(unorderedNums);
        int maxGap = 0;
        for (int i = 1; i < unorderedNums.length; i++)
        {
            maxGap = Math.max(unorderedNums[i] - unorderedNums[i - 1], maxGap);
        }
        return maxGap;
    }
}
