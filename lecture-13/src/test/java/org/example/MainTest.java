package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest
{


    @Test
    void testOneDigitSplit() throws Exception
    {
        assertArrayEquals(new int[]{0, 0, 0, 0}, Main.splitNumberIntoDigits(0));
        assertArrayEquals(new int[]{0, 0, 0, 1}, Main.splitNumberIntoDigits(1));
        assertArrayEquals(new int[]{0, 0, 0, 5}, Main.splitNumberIntoDigits(5));
        assertArrayEquals(new int[]{0, 0, 0, 9}, Main.splitNumberIntoDigits(9));

    }

    @Test
    void testTwoDigitSplit() throws Exception
    {

        assertArrayEquals(new int[]{0, 0, 1, 0}, Main.splitNumberIntoDigits(10));
        assertArrayEquals(new int[]{0, 0, 1, 4}, Main.splitNumberIntoDigits(14));
        assertArrayEquals(new int[]{0, 0, 8, 5}, Main.splitNumberIntoDigits(85));
    }

    @Test
    void testThreeDigitSplit() throws Exception
    {
        assertArrayEquals(new int[]{0, 0, 1, 1}, Main.splitNumberIntoDigits(11));
        assertArrayEquals(new int[]{0, 0, 8, 5}, Main.splitNumberIntoDigits(85));
        assertArrayEquals(new int[]{0, 0, 9, 9}, Main.splitNumberIntoDigits(99));
    }

    @Test
    void testFourDigitSplit() throws Exception
    {
        assertArrayEquals(new int[]{1, 1, 1, 1}, Main.splitNumberIntoDigits(1111));
        assertArrayEquals(new int[]{3, 9, 9, 9}, Main.splitNumberIntoDigits(3999));
        assertArrayEquals(new int[]{3, 3, 3, 3}, Main.splitNumberIntoDigits(3333));
    }


    @Test
    void testThrowsExceptionNegatives()
    {
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-1));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-9));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-15));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-55));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-111));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-555));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-3333));
        assertThrows(SplitNumberException.class, () -> Main.splitNumberIntoDigits(-3999));
    }

    @Test
    void testReturnsSingleDigitRomans()
    {
        assertEquals("I", Main.convertDigToRoman(1, "I", "V", "X"));
        assertEquals("II", Main.convertDigToRoman(2, "I", "V", "X"));
        assertEquals("III", Main.convertDigToRoman(3, "I", "V", "X"));
        assertEquals("IV", Main.convertDigToRoman(4, "I", "V", "X"));
        assertEquals("V", Main.convertDigToRoman(5, "I", "V", "X"));
        assertEquals("VI", Main.convertDigToRoman(6, "I", "V", "X"));
        assertEquals("VII", Main.convertDigToRoman(7, "I", "V", "X"));
        assertEquals("VIII", Main.convertDigToRoman(8, "I", "V", "X"));
        assertEquals("IX", Main.convertDigToRoman(9, "I", "V", "X"));
    }

    @Test
    void testReturnsDoubleDigitRomans() throws Exception
    {
        String[] expectedDoubleDigRom = {"X", "XI", "XII", "XIII", "XIV", "XV", "XVI", "XX", "XXI", "XXIII", "XXIX", "XXX", "L", "LI", "LV"};
        assertEquals(expectedDoubleDigRom[0], Main.convertArabicToRomanNumerals(10));
        assertEquals(expectedDoubleDigRom[1], Main.convertArabicToRomanNumerals(11));
        assertEquals(expectedDoubleDigRom[2], Main.convertArabicToRomanNumerals(12));
        assertEquals(expectedDoubleDigRom[3], Main.convertArabicToRomanNumerals(13));
        assertEquals(expectedDoubleDigRom[4], Main.convertArabicToRomanNumerals(14));
        assertEquals(expectedDoubleDigRom[5], Main.convertArabicToRomanNumerals(15));
        assertEquals(expectedDoubleDigRom[6], Main.convertArabicToRomanNumerals(16));
        assertEquals(expectedDoubleDigRom[7], Main.convertArabicToRomanNumerals(20));
        assertEquals(expectedDoubleDigRom[8], Main.convertArabicToRomanNumerals(21));
        assertEquals(expectedDoubleDigRom[9], Main.convertArabicToRomanNumerals(23));
        assertEquals(expectedDoubleDigRom[10], Main.convertArabicToRomanNumerals(29));
    }

    @Test
    void testReturnsTripleDigitRomans() throws Exception
    {
        String[] expectedDoubleDigRom = {"C", "CCX", "CCXL", "CCCL", "CDLX", "DLXX", "DCXI", "DCCLXXXIX", "CMXCIX"};
        assertEquals(expectedDoubleDigRom[0], Main.convertArabicToRomanNumerals(100));
        assertEquals(expectedDoubleDigRom[1], Main.convertArabicToRomanNumerals(210));
        assertEquals(expectedDoubleDigRom[2], Main.convertArabicToRomanNumerals(240));
        assertEquals(expectedDoubleDigRom[3], Main.convertArabicToRomanNumerals(350));
        assertEquals(expectedDoubleDigRom[4], Main.convertArabicToRomanNumerals(460));
        assertEquals(expectedDoubleDigRom[5], Main.convertArabicToRomanNumerals(570));
        assertEquals(expectedDoubleDigRom[6], Main.convertArabicToRomanNumerals(611));
        assertEquals(expectedDoubleDigRom[7], Main.convertArabicToRomanNumerals(789));
        assertEquals(expectedDoubleDigRom[8], Main.convertArabicToRomanNumerals(999));
    }

    @Test
    void testReturnsQuadDigitRomans() throws Exception
    {
        String[] expectedDoubleDigRom = {"MCXI", "MMCCCXLIII", "MMMCMXCIX"};
        assertEquals(expectedDoubleDigRom[0], Main.convertArabicToRomanNumerals(1111));
        assertEquals(expectedDoubleDigRom[1], Main.convertArabicToRomanNumerals(2343));
        assertEquals(expectedDoubleDigRom[2], Main.convertArabicToRomanNumerals(3999));
    }
}