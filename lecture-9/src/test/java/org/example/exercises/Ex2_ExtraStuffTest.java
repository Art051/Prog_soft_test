package org.example.exercises;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class Ex2_ExtraStuffTest
{

    @Test
    void testConvertStringInputToArrayListCorrectly()
    {

        List<String> expected = Arrays.asList("This", "is", "a", "great", "big", "blue", "ship", "with", "blue", "sails");

        assertEquals(expected, Ex2_ExtraStuff.setStringArrayListFromSentence("This is a great big blue ship with blue sails"));
        assertNotEquals(expected, Ex2_ExtraStuff.setStringArrayListFromSentence("is a great big blue ship with blue sails"));
    }

    @Test
    void testCountsSearchedWordsCorrectlyIgnoringCase()
    {

        int expected = 2;

        assertEquals(expected, Ex2_ExtraStuff.searchForWordReturnCount(
                List.of("This", "is", "a", "great", "big", "blue", "ship", "with", "blue", "sails"),
                10,
                "blue",
                false));
    }

    @Test
    void testCountsSearchedWordsCorrectlyCasesDoesntMatch()
    {
        int expectedWhenNotMatching = 0;

        assertEquals(expectedWhenNotMatching, Ex2_ExtraStuff.searchForWordReturnCount(
                Arrays.asList("This", "is", "a", "great", "big", "blue", "ship", "with", "blue", "sails"),
                10,
                "Blue",
                true));

        int expectedWhenMatching = 2;

        assertEquals(expectedWhenMatching, Ex2_ExtraStuff.searchForWordReturnCount(
                Arrays.asList("This", "is", "a", "great", "big", "blue", "ship", "with", "blue", "sails"),
                10,
                "blue",
                true));
    }

    @Test
    void testCorrectlyIdentifiesWordPositionsInSentence(){
        List<Integer> expectedPositionsWhenMatching = List.of(6,9);
        List<Integer> expectedPositionsWhenNotMatching = List.of();

        assertEquals(expectedPositionsWhenMatching, Ex2_ExtraStuff.searchForWordReturnPositionsArrList(
                Arrays.asList("This", "is", "a", "great", "big", "blue", "ship", "with", "blue", "sails"),
                10,
                "blue",
                false
                ));

        assertEquals(expectedPositionsWhenNotMatching, Ex2_ExtraStuff.searchForWordReturnPositionsArrList(
                Arrays.asList("This", "is", "a", "great", "big", "blue", "ship", "with", "blue", "sails"),
                10,
                "Blue",
                true
                ));

    }
}