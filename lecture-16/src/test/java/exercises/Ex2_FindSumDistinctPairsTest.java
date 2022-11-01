package exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;

class Ex2_FindSumDistinctPairsTest
{
    @Test
    void testAssignsIndividualCounts()
    {
        HashMap<Integer, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put(-1, 1);
        expectedHashMap.put(-12, 1);
        expectedHashMap.put(-55, 1);
        expectedHashMap.put(0, 1);
        expectedHashMap.put(1, 1);
        expectedHashMap.put(12, 1);
        expectedHashMap.put(55, 1);

        assertEquals(expectedHashMap, Ex2_FindSumDistinctPairs.setValueCountsHashMap(new int[]{1, 12, 55, 0, -1, -12, -55}));
    }

    @Test
    void testAssignsPairsOrEvens()
    {
        HashMap<Integer, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put(-1, 2);
        expectedHashMap.put(-12, 2);
        expectedHashMap.put(-55, 4);
        expectedHashMap.put(0, 2);
        expectedHashMap.put(1, 6);
        expectedHashMap.put(12, 2);
        expectedHashMap.put(55, 2);

        assertEquals(expectedHashMap, Ex2_FindSumDistinctPairs.setValueCountsHashMap(
                new int[]{1, 1, 1, 1, 1, 1, 12, 55, 0, -1, -12, -55, -55, -55, 1, 12, 55, 0, -1, -12, -55}));
    }

    @Test
    void testAssignsOdds()
    {
        HashMap<Integer, Integer> expectedHashMap = new HashMap<>();
        expectedHashMap.put(-1, 1);
        expectedHashMap.put(-12, 13);
        expectedHashMap.put(55, 5);
        expectedHashMap.put(4, 7);

        assertEquals(expectedHashMap, Ex2_FindSumDistinctPairs.setValueCountsHashMap(
                new int[]{-1, -12, -12, -12, -12, -12, -12, -12, -12, -12, -12, -12, -12, -12, 55, 55, 55, 55, 55, 4, 4, 4, 4, 4, 4, 4}));
    }

    @Test
    void testReturnsZeroIfNoPairs()
    {
        HashMap<Integer, Integer> testHashMap = new HashMap<>();
        testHashMap.put(-44, 1);
        testHashMap.put(-12, 1);
        testHashMap.put(1, 1);
        testHashMap.put(0, 1);
        testHashMap.put(54, 1);
        testHashMap.put(100, 1);

        assertEquals(0, Ex2_FindSumDistinctPairs.sumUniquePairs(testHashMap));
    }

    @Test
    void testReturnsNegativeIfOnlyNegativePairs()
    {
        HashMap<Integer, Integer> testHashMap = new HashMap<>();
        testHashMap.put(-44, 2);
        testHashMap.put(-12, 2);

        assertEquals(-56, Ex2_FindSumDistinctPairs.sumUniquePairs(testHashMap));
    }

    @Test
    void testReturnsPositiveIfOnlyPositivePairs()
    {
        HashMap<Integer, Integer> testHashMap = new HashMap<>();
        testHashMap.put(23, 2);
        testHashMap.put(100, 2);

        assertEquals(123, Ex2_FindSumDistinctPairs.sumUniquePairs(testHashMap));
    }
}