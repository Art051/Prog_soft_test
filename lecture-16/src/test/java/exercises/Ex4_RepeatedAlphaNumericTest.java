package exercises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class Ex4_RepeatedAlphaNumericTest
{

    @Test
    void testFindsFirstRepeatInUnPunctuatedSentence()
    {
        assertEquals("o", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("The quick brown fox jumps over the lazy dog"));
        assertEquals("o", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("School"));
        assertEquals("f", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("Cardiff is a city"));
    }


    @Test
    void testFindsFirstRepeatInSentenceWithPunctuationAtEnd()
    {
        assertEquals("o", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("The quick brown fox jumps over the lazy dog."));
        assertEquals("o", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("School."));
        assertEquals("f", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("Cardiff is a city."));
    }
    @Test
    void testFindsFirstRepeatInSentenceWithPunctuationRandomlyPlaced()
    {
        assertEquals("o", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("The qui.,ck brown!fox?jumps over the lazy dog."));
        assertEquals("o", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum(",Scho..ol??"));
        assertEquals("f", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("Cardiff i s.?a city."));
    }

    @Test
    void testFindsRepeatedNumber()
    {
        assertEquals("1", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("The qui.,ck1brown1fox?jumps over the lazy dog."));
        assertEquals("0", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum(",Sch0..0l??"));
        assertEquals("5", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("Cardf5i 5.?a city."));
    }

    @Test
    void testReturnsNoneFoundString()
    {
        assertEquals("No repeating alphanumeric character found.", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("abcdefghijklmnopqrstuvwxyz."));
        assertEquals("No repeating alphanumeric character found.", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum(""));
        assertEquals("No repeating alphanumeric character found.", Ex4_RepeatedAlphaNumeric.findFirstRepeatAlphaNum("."));
    }
}