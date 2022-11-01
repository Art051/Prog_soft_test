package exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class Ex1_UnorderedNumsTest
{

    @Test
    void testReturnsZeroIfGivenOneElement()
    {
        Assertions.assertEquals(0, Ex1_UnorderedNums.findMaxGap(new int[]{1}));
        Assertions.assertEquals(0, Ex1_UnorderedNums.findMaxGap(new int[]{21}));
        Assertions.assertEquals(0, Ex1_UnorderedNums.findMaxGap(new int[]{100}));
    }

    @Test
    void testReturnsZeroIfGivenMultipleOfSameElement()
    {
        Assertions.assertEquals(0, Ex1_UnorderedNums.findMaxGap(new int[]{55, 55, 55, 55}));
        Assertions.assertEquals(0, Ex1_UnorderedNums.findMaxGap(new int[]{55, 55, 55, 55, 55}));
    }

    @Test
    void testReturnRandomGapSizes()
    {
        Assertions.assertEquals(4, Ex1_UnorderedNums.findMaxGap(new int[]{11, 14, 10, 5, 1, 5, 12, 16, 6, 12, 10, 10, 12, 14, 4, 11}));
        Assertions.assertEquals(3989, Ex1_UnorderedNums.findMaxGap(new int[]{5, 66, 4322, 54, 333, 46}));
        Assertions.assertEquals(98198, Ex1_UnorderedNums.findMaxGap(new int[]{567, 98765, 34}));
    }

    @Test
    void testMultipleIdenticalSizeGaps()
    {
        Assertions.assertEquals(52, Ex1_UnorderedNums.findMaxGap(new int[]{1, 53, 105, 157}));
        Assertions.assertEquals(1, Ex1_UnorderedNums.findMaxGap(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}));
    }

    @Test
    void testHandlesNegativeValues()
    {
        Assertions.assertEquals(4, Ex1_UnorderedNums.findMaxGap(new int[]{-4, -8}));
        Assertions.assertEquals(5, Ex1_UnorderedNums.findMaxGap(new int[]{-5, -10, -15}));
        Assertions.assertEquals(10, Ex1_UnorderedNums.findMaxGap(new int[]{-10, -20, -30, -40}));
    }

    @Test
    void testHandlesNegativeAndPositiveValues()
    {
        Assertions.assertEquals(5, Ex1_UnorderedNums.findMaxGap(new int[]{-5, -10, -15, 0, 5, 10, 15}));
        Assertions.assertEquals(20, Ex1_UnorderedNums.findMaxGap(new int[]{-10, -20, -30, -40, 10, 20, 30, 40}));
        Assertions.assertEquals(76, Ex1_UnorderedNums.findMaxGap(new int[]{-43, -55, -100, 100, 33, 86}));
    }
}