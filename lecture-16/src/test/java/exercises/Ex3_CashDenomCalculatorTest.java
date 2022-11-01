package exercises;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

class Ex3_CashDenomCalculatorTest
{
    @Test
    void testCalculatesOneOfEachPound()
    {
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[]{5000, 1});
        expected.add(new int[]{2000, 1});
        expected.add(new int[]{1000, 1});
        expected.add(new int[]{500, 1});
        expected.add(new int[]{200, 1});
        expected.add(new int[]{100, 1});

        ArrayList<int[]> actual = Ex3_CashDenomCalculator.countDenominations(88);

        Assertions.assertEquals(expected.size(), actual.size());

        for (int i = 0; i < actual.size(); i++)
        {
            Assertions.assertArrayEquals(expected.get(i), actual.get(i));
        }

    }

    @Test
    void testCalculatesOneOfEachPence()
    {
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[]{50, 1});
        expected.add(new int[]{20, 1});
        expected.add(new int[]{10, 1});
        expected.add(new int[]{5, 1});
        expected.add(new int[]{2, 1});
        expected.add(new int[]{1, 1});

        ArrayList<int[]> actual = Ex3_CashDenomCalculator.countDenominations(0.88);

        Assertions.assertEquals(expected.size(), actual.size());

        for (int i = 0; i < actual.size(); i++)
        {
            Assertions.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }


    @Test
    void testCalculatesOneOfEachDenom()
    {
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[]{5000, 1});
        expected.add(new int[]{2000, 1});
        expected.add(new int[]{1000, 1});
        expected.add(new int[]{500, 1});
        expected.add(new int[]{200, 1});
        expected.add(new int[]{100, 1});
        expected.add(new int[]{50, 1});
        expected.add(new int[]{20, 1});
        expected.add(new int[]{10, 1});
        expected.add(new int[]{5, 1});
        expected.add(new int[]{2, 1});
        expected.add(new int[]{1, 1});

        ArrayList<int[]> actual = Ex3_CashDenomCalculator.countDenominations(88.88);

        Assertions.assertEquals(expected.size(), actual.size());

        for (int i = 0; i < actual.size(); i++)
        {
            Assertions.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }

    @Test
    void testPennies()
    {
        ArrayList<int[]> expected = new ArrayList<>();
        expected.add(new int[]{1, 1});

        ArrayList<int[]> actual = Ex3_CashDenomCalculator.countDenominations(0.01);

        Assertions.assertEquals(expected.size(), actual.size());

        for (int i = 0; i < actual.size(); i++)
        {
            Assertions.assertArrayEquals(expected.get(i), actual.get(i));
        }
    }
}
