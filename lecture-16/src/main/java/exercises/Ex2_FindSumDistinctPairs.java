package exercises;

import java.util.HashMap;

public class Ex2_FindSumDistinctPairs
{
    /*
    Find the sum of distinct pairs for a group of integers (you may decide the data structure).
    When a pair is detected, only sum the value once in the final output.
    Each number may only match once and should only be counted once.
    E.G. if provided with:
    22, 3, 7, 5, 4, 22, 4, 0, -5, 12, -22, 22, 7, 3, -24, 4, 4

    This should identify the duplicates: 22, 3, 7, 5, 4, 22, 4, 0, -5, 12, -22, 22, 7, 	3, -24, 4, 4 – and should therefore sum 22, 3, 7, 4, 4 to return 40.
	Note: we only match pairs. We don’t match the third 22 because it doesn’t 	form part of a pair. We do, however, match the fourth 4 as two pairs.
	Negative numbers should be supported, and should be subtracted – but a negative 	and positive of the same value will, of course, not match.
     */

    public static void main(String[] args)
    {
        int[] nums = {22, 3, 7, 5, 4, 22, 4, 0, -5, 12, -22, 22, 7, 3, -24, 4, 4};
        HashMap<Integer, Integer> uniqueValueCounts = setValueCountsHashMap(nums);
        int total = sumUniquePairs(uniqueValueCounts);
        System.out.printf("The total sum of unique pairs is: %d", total);
    }

    /**
     * <P>
     *     Iterates through and integer array, at each index it checks the uniqueValues HashMap.
     *     If uniqueValues contains the value already as a key, it will increment the value by 1.
     * @param unsortedValues A random array of integers
     * @return A HashMap where Key is a unique integer from the int[] parameter and Value is the count of the Key's occurrences in the int[] parameter.
     */
    public static HashMap<Integer, Integer> setValueCountsHashMap(int[] unsortedValues)
    {
        HashMap<Integer, Integer> uniqueValues = new HashMap<>();

        for (int num : unsortedValues)
        {
            if (!uniqueValues.containsKey(num))
            {
                uniqueValues.put(num, 1);
            }
            else
            {
                uniqueValues.replace(num, uniqueValues.get(num) + 1);
            }
        }
        return uniqueValues;
    }


    /**
     * <P>
     *     Iterates through each Key, Value pair to remove any pairs where the Key appears less than twice, and remove any non-paired occurrences.
     *     i.e. reduces 3 occurrences to 2, 5 to 4 etc.
     * @param uniqueValues HashMap containing Keys representing unique integers and Values representing the count of the Key's occurrences.
     * @return Sum of every key which occurs in multiples of 2.
     */
    public static int sumUniquePairs(HashMap<Integer, Integer> uniqueValues)
    {
        int total = 0;
        for (int pairedValue : uniqueValues.keySet())
        {
            total += pairedValue * (uniqueValues.get(pairedValue) / 2);
        }
        return total;
    }
}
